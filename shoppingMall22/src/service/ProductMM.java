package service;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import bean.Forward;
import bean.Product;
import dao.ProductDao;

public class ProductMM {
	HttpServletRequest request;
	HttpServletResponse response;

	public ProductMM(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public Forward insertproduct() {
		Forward fw = new Forward();
		if(request.getSession().getAttribute("id")==null) {
			fw.setPath("./");
			fw.setRedirect(true);
			return fw;
		}
		String uploadPath = request.getSession().getServletContext().getRealPath("upload");
		System.out.println("path=" + uploadPath);
		File dir = new File(uploadPath);
		if (!dir.exists()) { // 클린시 업로드 폴더 삭제될경우를 대비
			dir.mkdir(); // dir.mkdirs(); 부모폴더까지 생성
		}
		int size = 10 * 1024 * 1024;
		//Forward fw = new Forward();
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8",
					new DefaultFileRenamePolicy());
			String kind = multi.getParameter("p_kind");
			String name = multi.getParameter("p_name");
			int price = Integer.parseInt(multi.getParameter("p_price"));
			int qty = Integer.parseInt(multi.getParameter("p_qty"));
			String contents = multi.getParameter("p_contents");
			String oriFileName = multi.getOriginalFileName("p_file");
			String sysFileName = multi.getFilesystemName("p_file");

			Product product = new Product();

			HttpSession session = request.getSession();
			product.setP_id(session.getAttribute("id").toString());
			product.setP_kind(kind);
			product.setP_name(name);
			product.setP_price(price);
			product.setP_qty(qty);
			product.setP_contents(contents);
			product.setP_oriFileName(oriFileName);
			product.setP_sysFileName(sysFileName);
			ProductDao pDao = new ProductDao();

			if (pDao.insertProduct(product)) {

				System.out.println("상품등록 성공");
			} else {
				System.out.println("상품등록 실패");
			}
			// 신상품 등록시 신상품 페이지, 인기상품 등록시 인기상품 페이지 이동
			if (product.getP_kind().equals("new")) {
				session.setAttribute("page", "newItem");
			} else {
				session.setAttribute("page", "bestItem");
			}
			fw = new Forward();
			fw.setPath("./");  //("index.jsp");
			//새로고침시 파일재업로드를 방지하려면
			//page속성을 session영역세 저장하고 true로 설정
			fw.setRedirect(true);
			pDao.close();

		} catch (IOException e) {
			System.out.println("상품등록 예외");
			e.printStackTrace();
		}
		return fw;

	}

	public Forward getItemList(String kind) {
		//로그인 한경우만 리스트를 볼수 있다면?
		Forward fw = new Forward();
		//index.jsp에서 로그인 검사를 같이 제거하거나 추가할 것 
		
//		if(request.getSession().getAttribute("id")==null) {
//			fw.setPath("./");
//			fw.setRedirect(true);
//			return fw;
//		}
		
		ProductDao pDao = new ProductDao();
		List<Product> pList=null;
		pList=pDao.getItemList(kind);
		pDao.close();
		
		if(pList!=null && pList.size()!=0) {
			String pListHtml = makeHtml_pList(pList);
			request.setAttribute("pList", pListHtml);
		}
		fw.setPath("main.jsp");
		fw.setRedirect(false);
		return fw;
	}

	private String makeHtml_pList(List<Product> pList) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<pList.size();i++) {
			Product p=pList.get(i);
			sb.append("<div id='list' onclick=\"detail('"+p.getP_code()+"')\">");
			sb.append("<img src='upload/"+p.getP_sysFileName()+"' width='60%'>");
			sb.append("</div>");
			
		}
		return sb.toString();
	}

	public String getAjaxDetail() {
		ProductDao pDao = new ProductDao();
		Product product = pDao.getAjaxDetail(request.getParameter("pCode"));
		Gson gs = new Gson();
		return gs.toJson(product);
	}
}

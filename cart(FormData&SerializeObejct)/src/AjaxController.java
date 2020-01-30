

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;



/**
 * Servlet implementation class AjaxController
 */
@WebServlet({"/formData","/serializeObject", "/order"})
public class AjaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String url = uri.substring(conPath.length());
		System.out.println("url=" + url);
		
		String json=null;
		String uploadPath=request.getRealPath("upload");
		if (url.equals("/formData")){
			MultipartRequest multi=new MultipartRequest(request, uploadPath,1*1024*1024,"UTF-8",
							             new DefaultFileRenamePolicy());
			String id=multi.getParameter("id");
			int cnt=Integer.valueOf(multi.getParameter("cnt"));
			System.out.println("cnt="+cnt);
			for(int i=0;i<cnt;i++) {
				String file=multi.getOriginalFileName("files"+i);
				System.out.println("file="+file);
			}
			
			json="성공";
		}else if(url.endsWith("/serializeObject")) {
			String jsonData=request.getParameter("data");
			System.out.println(jsonData);
			
			//json이 리스트일때
			List<Member> mList=new Gson().fromJson(jsonData,new TypeToken<List<Member>>(){}.getType());
			for(int i=0;i<mList.size();i++){
				System.out.print(mList.get(i).getId()+",");
				System.out.println(mList.get(i).getPw());
			}
			//json이 리스트아닐때
			/*Member mb=new Gson().fromJson(jsonData,new TypeToken<Member>(){}.getType());
			System.out.println(mb.getId());
			System.out.println(mb.getPw());*/
			json="성공";
		}
		else if(url.endsWith("/order")) {
			System.out.println("order call");
			String jsonData=request.getParameter("data");
			System.out.println(jsonData);
			
			if(jsonData.contains("[")) {
				Product p=new Gson().fromJson(jsonData,new TypeToken<Product>(){}.getType());
				for(int i=0;i<p.getPcode().length;i++) {
					System.out.print(p.getPcode()[i]+",");
					System.out.println(p.getQty()[i]);
				}
			}else {
				ProductOne p1=new Gson().fromJson(jsonData,new TypeToken<ProductOne>(){}.getType());
				System.out.println(p1.getPcode());
				System.out.println(p1.getQty());
			}
			json="성공";
		}
		if(json!=null) {
    		response.setContentType("text/html;charset=utf-8");
    		PrintWriter out=response.getWriter();//out은 응답객체로 생성
    		out.write(json);
    	}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}
}

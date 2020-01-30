package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Forward;
import service.MemberMM;
import service.ProductMM;

@WebServlet({"/menu","/newItem","/bestItem","/access",
	"/joinfrm","/logout","/proupfrm","/insertproduct","/cartfrm"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd=request.getServletPath();
		Forward fw=null;
		MemberMM mm=new MemberMM(request,response);
		ProductMM pm=new ProductMM(request, response);
		switch(cmd) {
		case "/menu":
			fw=new Forward();
			fw.setPath("menu.jsp");
			fw.setRedirect(false);
			break;
		case "/newItem":
			fw=pm.getItemList("new");
			
//			fw=new Forward();
//			fw.setPath("newItem.jsp");
//			fw.setRedirect(false);
			break;
		case "/bestItem":
			fw=pm.getItemList("best");
			
			
//			fw=new Forward();
//			fw.setPath("bestItem.jsp");
//			fw.setRedirect(false);
			break;
		case "/access":
			fw=new Forward();
			fw=mm.access();
			//fw.setPath("access.jsp");
			//fw.setRedirect(false);
			break;
		case "/logout":
			fw=new Forward();
			fw=mm.logout();
			break;
		case "/proupfrm":
			fw=new Forward();
			fw.setPath("/product/proUpfrm.jsp");
			fw.setRedirect(false);
			break;
		case "/insertproduct":
			fw=new Forward();
			fw=pm.insertproduct();
			break;
		case "/cartfrm":
			fw=new Forward();
			fw.setPath("/product/cartfrm.jsp");
			fw.setRedirect(false);
			break;
		}
		if(fw!=null) {
			if(fw.isRedirect()) {
				response.sendRedirect(fw.getPath());
			}else {
				request.getRequestDispatcher(fw.getPath()).forward(request, response);
			}
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}

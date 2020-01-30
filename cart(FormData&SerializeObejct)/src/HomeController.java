/*

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Forward;
import service.MemberMM;
import service.ProductMM;



@WebServlet({"/access", "/joinForm","/logout","/proUpForm",
	"/insertProduct","/menu","/newItem","/bestItem"})
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri=request.getRequestURI();
    	String conPath=request.getContextPath();
    	String url=uri.substring(conPath.length());
    	System.out.println("url="+url);
    	Forward fw=null;
    	MemberMM mm=new MemberMM(request, response);
    	ProductMM pm=new ProductMM(request, response);
    	
    	if(url.equals("/joinForm")) {
    		fw=new Forward();
    		fw.setPath("joinForm.jsp");
    		fw.setRedirect(false);
    	}else if(url.equals("/access")) {
    		fw=mm.access();
    	}else if(url.equals("/logout")) {
    		fw=mm.logout();
    	}else if(url.equals("/proUpForm")) {
    		fw=new Forward();
    		fw.setPath("product/proUpForm.jsp");
    		fw.setRedirect(false); 
    	}else if(url.equals("/insertProduct")) {
    		fw=pm.insertProduct();
    	}else if(url.equals("/menu")) {
    		fw=new Forward();   //필요에 따라 DB에 다녀올수 있음..
    		fw.setPath("menu.jsp");  
    		fw.setRedirect(false);
    	}else if(url.equals("/newItem")) {
    		fw=pm.getItemList("new");
    	}else if(url.equals("/bestItem")) {
    		fw=pm.getItemList("best");
       	}
    	//response.setCharacterEncoding("UTF-8");
    	if(fw!=null) {
    		if(fw.isRedirect()) {
    			response.sendRedirect(fw.getPath());
    		}else {
    			RequestDispatcher dis=request.getRequestDispatcher(fw.getPath());
    			dis.forward(request, response);
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
*/
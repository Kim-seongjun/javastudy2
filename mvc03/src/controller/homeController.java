package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Forward;
import service.MemberMM;

@WebServlet({ "/loginfrm", "/access", "/logout","/memberjoin",
	"/joinfrm","/memberlist","/memberinfo","/memberdelete","/historydelete" })
public class homeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String cmd = uri.substring(conPath.length());
		System.out.println("cmd=" + cmd);
		System.out.println("conPath=" + conPath);
		System.out.println("uri=" + uri);
		//헤더
		
		
		
		// 회원관리 서비스 클래스
		MemberMM mm = new MemberMM(request, response);
		Forward fw = new Forward();
		HttpSession session = null;
		if (cmd.equals("/loginfrm")) {
	         session = request.getSession();
	         if (session.getAttribute("id") != null) {
	            // 로그인을 한 경우 만족
	            fw.setPath("main.jsp");
	            fw.setRedirect(true);
	         } else {
	            fw.setPath("loginForm.html");
	            fw.setRedirect(false);
	         }
	      }
	      else if(cmd.equals("/joinfrm")) {
	    	  session = request.getSession();
	    	  if (session.getAttribute("id") != null) {
	              // 로그인을 한 경우 만족
	              fw.setPath("main.jsp");
	              fw.setRedirect(true);
	           } else {
	              fw.setPath("joinForm.jsp");
	              fw.setRedirect(false);
	           }
	      }
	      else if(cmd.equals("/main")) {
	    	  session = request.getSession();
	    	  if (session.getAttribute("id") != null) {
	              // 로그인을 한 경우 만족
	              fw.setPath("main.jsp");
	              fw.setRedirect(true);
	           } else {
	              fw.setPath("loginForm.html");
	              fw.setRedirect(false);
	           }
	      }
	      else if(cmd.equals("/memberjoin")) {
	    	  fw=mm.memberJoin();
	      }else if(cmd.equals("/access")) {
	    	  fw=mm.access();
	      }else if(cmd.equals("/memberlist")) {
	    	  fw=mm.memberList();
	      }else if(cmd.equals("/logout")) {
	    	  fw=mm.logout();
	      }else if(cmd.equals("/memberinfo")) {
	    	  fw=mm.getInfo();
	      }else if(cmd.equals("/memberdelete")) {
	    	  fw=mm.delete();
	      }else if(cmd.equals("/historydelete")) {
	    	  fw=mm.deleteHistory();
	      }
		
		if (fw != null) {
			if (fw.isRedirect()) {
				response.sendRedirect(fw.getPath());
			} else {
				request.getRequestDispatcher(fw.getPath()).forward(request, response);
			}
		}

	}

//    protected boolean isLogin(HttpServletRequest request) {
//    	
//    	HttpSession session=request.getSession(true);
//    	if(session.getAttribute("id")!=null) {
//    		return true;
//    	}else {
//    		return false;
//    	}
//  }
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}

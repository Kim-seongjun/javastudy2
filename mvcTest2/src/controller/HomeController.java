package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.Forward;
import service.MemberMM;

@WebServlet({ "/loginfrm", "/joinfrm", "/access", "/logout", "/main","/memberjoin" })
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String cmd = uri.substring(conPath.length());
		System.out.println("cmd=" + cmd);
		// 회원관리 서비스 클래스
		MemberMM mm = new MemberMM(request, response);
		Forward fw = null;
		HttpSession session = null;
		if (cmd.equals("/loginfrm")) {
			fw = new Forward();
			session = request.getSession();
			if (session.getAttribute("id") != null) { // 로그인을 한경우
				fw.setPath("/main.jsp");
				fw.setRedirect(true);
			} else {
				fw.setPath("/loginForm.html");
				fw.setRedirect(false);
			}
		} else if (cmd.equals("/joinfrm")) {
			fw = new Forward();
			session = request.getSession();
			if (session.getAttribute("id") != null) {
				// 로그인 된 경우
				fw.setPath("/main.jsp");
				fw.setRedirect(false);
			} else {
				fw.setPath("/joinForm.jsp");
				fw.setRedirect(false);
			}
		} else if (cmd.equals("/main.jsp")) {
			fw = new Forward();
			session = request.getSession();
			if (session.getAttribute("id") != null) {
				// 로그인 된 경우
				fw.setPath("/main.jsp");
				fw.setRedirect(false);
			} else {
				fw.setPath("/loginForm.html");
				fw.setRedirect(false);
			}
		} else if (cmd.equals("/memberjoin")) {
			fw = mm.memberJoin();
		}else if (cmd.equals("/access")) {
			fw = mm.access();
		}

		if (fw != null) {
			if (fw.isRedirect()) { // true
				response.sendRedirect(fw.getPath());
			} else {
				request.getRequestDispatcher(fw.getPath()).forward(request, response);
			}
		} // if End
	}// doprocess End

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

}

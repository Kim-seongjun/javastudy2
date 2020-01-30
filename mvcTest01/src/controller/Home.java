package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.Forward;
import service.MemberMM;


@WebServlet({"/main","/loginform","/joinform","/access", "/logout", "/memberjoin"})
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String uri = request.getRequestURI();
		String conPath = request.getContextPath();
		String cmd = uri.substring(conPath.length());
//		System.out.println("uri="+uri);
//		System.out.println("conPath="+conPath);
		System.out.println("cmd="+cmd);
		
		//회원관리 서비스 클래스
		MemberMM mm = new MemberMM(request, response);
		Forward fw = null;
		HttpSession session = null;
//		String path = null;
		
		switch(cmd) {
		case "/logout":
			fw=new Forward();
			session = request.getSession();
			session.invalidate(); //세션 무효화
			fw.setPath("loginForm.html");
			fw.setRedirect(true);
			break;
		case "/main":
			fw=new Forward();
			session=request.getSession();
			if(session.getAttribute("id")!=null) { //로그인 상태
				fw.setPath("main.jsp");
				fw.setRedirect(false);
			}else { //로그인이 안된 상태
				fw.setPath("loginForm.html");  //url
				fw.setRedirect(true);
			}
			break;
		case "/loginform":
			fw = new Forward();
			session=request.getSession();
			//로그인 여부 확인
			if(session.getAttribute("id")==null) { //로그인이 안되있을때
				fw.setPath("loginForm.html");
				fw.setRedirect(false);
			}else { //로그인이 되있는 상태면
				fw.setPath("main.jsp");
				fw.setRedirect(true);
			}
			break;
		case "/access":
			fw=mm.access();
			break;
		case "/joinform": //회원가입창으로 포워딩(이동)
			fw = new Forward();
			fw.setPath("joinForm.jsp");
			fw.setRedirect(false); //디스패처 방식
			break;
		case "/memberjoin": //DB에 회원정보 저장
			fw = mm.memberJoin();
			
			//path = "/loginForm.html";
			break;
			
		default:
		}
		if(fw!=null) {
			if(fw.isRedirect()) {
				response.sendRedirect(fw.getPath());
			}else {
				RequestDispatcher dis = request.getRequestDispatcher(fw.getPath());
				dis.forward(request, response);
			}
		}
		//포워딩
//		RequestDispatcher dis = request.getRequestDispatcher(path);
//		dis.forward(request, response);
	}  

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


}

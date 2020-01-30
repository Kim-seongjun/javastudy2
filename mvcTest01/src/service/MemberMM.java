package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import been.Forward;
import been.Member;
import dao.MemberDao;

public class MemberMM {
	MemberDao mDao = null;
	HttpServletRequest request;
	HttpServletResponse response;
	
	public MemberMM(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public Forward memberJoin() {
		
		//DB에 저장후
		MemberDao mDao = new MemberDao(); //connection 객체
		Member mb=new Member();
		mb.setId(request.getParameter("id"));
		mb.setPw(request.getParameter("pw"));
		mb.setName(request.getParameter("name"));
		mb.setGender(request.getParameter("gender"));
		
		boolean result = mDao.memberJoin(mb);
		mDao.close(); //con반납
		
		Forward fw = new Forward();
		if(result) {
			fw.setPath("loginForm.jsp");
			fw.setRedirect(true);
		}else {
			request.setAttribute("msg", "회원가입 실패");
			fw.setPath("joinForm.jsp");
			fw.setRedirect(false);
		}
		
		HttpSession session = request.getSession();
		fw.setPath("loginForm.html");
		fw.setRedirect(true); //리다이렉트 방식
		return fw;
	}

	public Forward access() {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
//		System.out.println("id="+id);
//		System.out.println("pw="+pw);
		mDao = new MemberDao();
		Member mb = new Member();
		mb.setId(id);
		mb.setPw(pw);
		boolean result = mDao.access(mb);
		mDao.close();
		
		Forward fw = new Forward();
		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			session.setAttribute("logOut", makeLogOutHtml());
			
			request.setAttribute("msg", "로그인 성공");
			request.setAttribute("member", mb);
			fw.setPath("main.jsp");
			fw.setRedirect(false);
		}else {
			fw.setPath("loginForm.jsp");
			fw.setRedirect(true);
			request.setAttribute("msg", "로그인 실패");
		}
		return fw;
	}

	private String makeLogOutHtml() {
		StringBuilder sb=new StringBuilder();
		//sb.append("<div>");
		sb.append("<form action = 'logout' method='post'>");
		sb.append("<button>로그아웃</button>");
		sb.append("</form>");
		
		return sb.toString();
	}
}

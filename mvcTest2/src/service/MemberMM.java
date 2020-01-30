package service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import been.Forward;
import been.Member;
import dao.MemberDao;



public class MemberMM {
	HttpServletRequest request;
	HttpServletResponse response;
	
	public MemberMM(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public Forward memberJoin() {
		Member mb = new Member();
		mb.setId(request.getParameter("id"));
		mb.setPw(request.getParameter("pw"));
		mb.setName(request.getParameter("name"));
		mb.setGender(request.getParameter("gender"));
		
		MemberDao mDao = new MemberDao(); //con객체 얻어옴
		boolean result = mDao.memberJoin(mb);
		mDao.close(); //con객체 반납
		
		Forward fw = new Forward();
		if(result) {
			fw.setPath("loginForm.html");
			fw.setRedirect(true);
		}else {
			request.setAttribute("msg", "회원가입 실패");
			fw.setPath("joinForm.jsp");
			fw.setRedirect(false); //dispatcher 포워딩
		}
		
		return fw;
	}//member join End

	public Forward access() {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("id", id);
		hMap.put("pw", pw);
		MemberDao mDao = new MemberDao();
		boolean result = mDao.access(hMap); //access(mb), //access(id,pw)
		mDao.close();
		
		Forward fw = new Forward();
		if(result) {
			fw.setPath("main.jsp");
			fw.setRedirect(true);
		}else {
			request.setAttribute("msg", "로그인 실패");
			fw.setPath("joinForm.jsp");
			fw.setRedirect(false); //dispatcher 포워딩
		}
		return fw;
	}

}//class End

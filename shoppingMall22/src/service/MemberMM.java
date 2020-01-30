package service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Forward;
import dao.MemberDao;

public class MemberMM {
	HttpServletRequest request;
	HttpServletResponse response;
	
	
	public MemberMM(HttpServletRequest request, HttpServletResponse response) {
		this.request=request;
		this.response=response;
	}
	
	public Forward access() {
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		MemberDao mDao=new MemberDao();
		
		int result=mDao.access(id,pw); //1:로그인성공,-1:id오류,0:pw오류
		mDao.close();
		if(result==-1) {
			request.setAttribute("msgAccess", "id를 확인하셔유.");
		}else if(result==0){
			request.setAttribute("msgAccess", "pw를 확인하셔유.");
		}else { //로그인 성공
			HttpSession session=request.getSession();
			session.setAttribute("id", id);
		}
		Forward fw = new Forward();
		fw.setPath("index.jsp");
		fw.setRedirect(false);
		return fw;
	}
	
	public Forward logout() {
		HttpSession session=request.getSession();
		session.invalidate();
		Forward fw = new Forward();
		fw.setPath("./");
		fw.setRedirect(true);
		return fw;
	}

	
}

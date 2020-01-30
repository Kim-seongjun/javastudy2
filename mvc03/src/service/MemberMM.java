package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import bean.Forward;
import bean.History;
import bean.Member;
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

		MemberDao mDao = new MemberDao();
		boolean result = mDao.memberJoin(mb);
		mDao.close();

		Forward fw = new Forward();
		if (result) {
			fw.setPath("loginForm.html");
			fw.setRedirect(true);
		} else {
			request.setAttribute("msg", "회원가입 실패");
			fw.setPath("joinForm.jsp");
			fw.setRedirect(false);
		}
		storeHistory("회원가입");

		return fw;
	}

	public Forward access() {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("id", id);
		hMap.put("pw", pw);
		MemberDao mDao = new MemberDao();
		boolean result = mDao.access(hMap);
		mDao.close();

		Forward fw = new Forward();
		if (result) {
			HttpSession session = request.getSession();
			session.setAttribute("id", id);
			session.setAttribute("logOutHtml", makeLogOutHtml());
			session.setAttribute("accessResult", makeResultHtml());
			fw.setPath("main.jsp");
			storeHistory("로그인");
			fw.setRedirect(true);
		} else {
			// request.setAttribute("msg", "회원가입 실패");
			fw.setPath("joinForm.jsp");
			fw.setRedirect(false); // dispatcher포워딩
			storeHistory("로그인 실패");
		}

		return fw;
	}

	private String makeResultHtml() {
		StringBuilder sb = new StringBuilder();
		HttpSession session = request.getSession();
		String id = (String) session.getAttribute("id");
		if (id.equals("admin")) {
			sb.append("<a href='memberlist'>관리자모드(회원목록보기)</a>");
		} else {
			sb.append("<a href='memberinfo?id=" + id + "'>본인정보확인</a>");
		}
		return sb.toString();
	}

	private String makeLogOutHtml() {
		StringBuilder sb = new StringBuilder();
		sb.append("<div>");
		sb.append("<form action='logout' method='post'>");
		sb.append("<button>로그아웃</button>");
		sb.append("</form>");
		sb.append("</div>");
		return sb.toString();

	}

	public Forward logout() {
		Forward fw = new Forward();
		HttpSession session = request.getSession();
		storeHistory("로그아웃");
		session.invalidate();
		fw.setPath("loginForm.html");
		fw.setRedirect(true);

		return fw;
	}

	public Forward memberList() {
		MemberDao mDao = new MemberDao();
		List<String> mList = mDao.memberList();
		Forward fw = new Forward();
		if (mList != null) {
			// request.setAttribute("mList", makemListHtml(mList));
			Gson gson = new Gson();
			// String gsonStr=gson.toJson(mList);
			request.setAttribute("mList", mList);
			// System.out.println(gsonStr);
			request.setAttribute("ht", HistoryTlbAll());
			fw.setPath("memberList.jsp");
			fw.setRedirect(false);
		} else {
			fw.setPath("main.jsp");
			fw.setRedirect(true);
		}
		storeHistory("관리자 목록 보기");
		return fw;
	}

	private String makemListHtml(List<String> mList) {
		StringBuilder sb = new StringBuilder();
		sb.append("<table border='1'>");
		for (int i = 0; i < mList.size(); i++) {
			sb.append("<tr align='center'>");
			sb.append("<td><a href='memberinfo?id=" + mList.get(i) + "'>" + mList.get(i) + "</a></td>");
			sb.append("<td><a href='memberdelete?id=" + mList.get(i) + "'>삭제</a></td>");
			sb.append("</tr>");
		}
		sb.append("</table>");
		return sb.toString();
	}

	public Forward getInfo() {
		MemberDao mDao = new MemberDao();
		Forward fw = new Forward();
		String id = request.getParameter("id");
		HttpSession session = request.getSession();
		Member mb = mDao.getInfo(id);
		if (mb != null) {
			StringBuilder sb = new StringBuilder();
			sb.append("<hr><h3>회원 정보</h3>");
			sb.append("<table border='1'>");
			sb.append("<tr align='center'><td>아이디</td><td>이름</td><td>성별</td></tr><tr>");
			sb.append("<td>" + mb.getId() + "</td>");
			sb.append("<td>" + mb.getName() + "</td>");
			sb.append("<td>" + mb.getGender() + "</td>");
			sb.append("</tr>");
			sb.append("</table>");
			request.setAttribute("info", sb.toString());
			fw.setPath("memberList.jsp");
			fw.setRedirect(false);
			session.setAttribute("logOutHtml", makeLogOutHtml());
			String ht =HistoryTlb();
			session.setAttribute("ht", ht);
			
		}
		storeHistory("정보보기");
		return fw;
	}

	public Forward delete() {
		MemberDao mDao = new MemberDao();
		Forward fw = new Forward();

		String id = request.getParameter("id");

		mDao.delete(id);
		List<String> mList = mDao.memberList();
		request.setAttribute("mList", mList);
		fw.setPath("memberList.jsp");
		fw.setRedirect(false);
		storeHistory("삭제");
		return fw;
	}

	public void storeHistory(String cmd) {
		MemberDao mDao = new MemberDao();
		// 브라우저 알아내는 코드
		String userAgent = (String) request.getHeader("User-Agent");
		String browser = "";
		History h = new History();
		if (userAgent.indexOf("Trident") > 0 || userAgent.indexOf("MSIE") > 0) {
			browser = "IE";
		} else if (userAgent.indexOf("Opera") > 0) {
			browser = "Opera";
		} else if (userAgent.indexOf("Firefox") > 0) {
			browser = "Firefox";
		} else if (userAgent.indexOf("Safari") > 0) {
			if (userAgent.indexOf("Chrome") > 0) {
				browser = "Chrome";
			} else {
				browser = "Safari";
			}
		}
		if (request.getSession().getAttribute("id") != null) {
			h.setId(request.getSession().getAttribute("id").toString()); // user id
		} else {
			h.setId(request.getParameter("id")); // user id
		}
		h.setBrowser(browser); // browser
		h.setIp(request.getRemoteAddr());
		h.setAction(cmd);
		mDao.insertHistory(h);

	}

	public String HistoryTlb() {
		MemberDao mDao = new MemberDao();
		Forward fw = new Forward();

		String id = request.getParameter("id");

		ArrayList<History> ht = mDao.historyTlb(id);
		StringBuilder sb = new StringBuilder();
		sb.append("<hr><h3>회원 정보</h3>");
		sb.append("<table border='1'>");
		System.out.println("테이블 사이즈:"+ht.size());
		sb.append("<tr align='center'><td>히스토리 아이디</td><td>아이디</td><td>아이피</td><td>행동</td><td>행동 시간</td><td>브라우저</td></tr>");
		
		for(int i=0;i<ht.size();i++) {
			System.out.println("아웃"+ht.get(i).getHistoryId());
			sb.append("<tr>"+ "<td>" + ht.get(i).getHistoryId() + "</td>");
			sb.append("<td>" + ht.get(i).getId() + "</td>");
			sb.append("<td>" + ht.get(i).getIp() + "</td>");
			sb.append("<td>" + ht.get(i).getAction() + "</td>");
			sb.append("<td>" + ht.get(i).getActionTime() + "</td>");
			sb.append("<td>" + ht.get(i).getBrowser() + "</td>");
			sb.append("<td><a href='historydelete?hid="+ht.get(i).getHistoryId()+"'>삭제</a></td>");
			sb.append("</tr>");
		}
		
		sb.append("</table>");

		request.setAttribute("hList", sb.toString());
		fw.setPath("memberList.jsp");
		fw.setRedirect(false);

		return sb.toString();
	}

	public String HistoryTlbAll() {
		MemberDao mDao = new MemberDao();
		Forward fw = new Forward();


		ArrayList<History> ht = mDao.historyTlb();
		StringBuilder sb = new StringBuilder();
		sb.append("<hr><h3>회원 정보</h3>");
		sb.append("<table border='1'>");
		System.out.println("테이블 사이즈:"+ht.size());
		sb.append("<tr align='center'><td>히스토리 아이디</td><td>아이디</td><td>아이피</td><td>행동</td><td>행동 시간</td><td>브라우저</td></tr>");
		
		for(int i=0;i<ht.size();i++) {
			System.out.println("아웃"+ht.get(i).getHistoryId());
			sb.append("<tr>"+ "<td>" + ht.get(i).getHistoryId() + "</td>");
			sb.append("<td>" + ht.get(i).getId() + "</td>");
			sb.append("<td>" + ht.get(i).getIp() + "</td>");
			sb.append("<td>" + ht.get(i).getAction() + "</td>");
			sb.append("<td>" + ht.get(i).getActionTime() + "</td>");
			sb.append("<td>" + ht.get(i).getBrowser() + "</td>");
			sb.append("<td><a href='historydelete?hid="+ht.get(i).getHistoryId()+"'>삭제</a></td>");
			sb.append("</tr>");
		}
		
		sb.append("</table>");
		fw.setPath("memberList.jsp");
		fw.setRedirect(false);

		return sb.toString();
	}
	public Forward deleteHistory() {
		MemberDao mDao = new MemberDao();
		Forward fw = new Forward();
		String hid=request.getParameter("hid");
		mDao.deleteHistory(hid);
		HistoryTlb();
		
		
		return fw;
	}
}

package com.icia.open.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.icia.open.Bean.Forward;
import com.icia.open.Bean.Member;
import com.icia.open.DAO.MemberDao;

public class MemberMM {
	HttpServletRequest request;
	HttpServletResponse response;

	public MemberMM(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public Forward index() {
		Forward fw = new Forward();
		fw.setPath("index.jsp");
		fw.setRedirect(false);
		return fw;

	}

	public Forward Joinfrm() {
		Forward fw = new Forward();
		MemberDao mDao = new MemberDao();
		Member mb = mDao.joinfrm();
		SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
		Date time = new Date();
		String time1 = format1.format(time);
		System.out.println("time1=" + time1);
		System.out.println("가져온다" + mb.getCustno());
		request.setAttribute("custno", mb.getCustno());
		request.setAttribute("time1", time1);
		fw.setPath("Joinfrm.jsp");
		fw.setRedirect(false);
		return fw;
	}

	public Forward memberlist() {
		Forward fw = new Forward();
		MemberDao mDao = new MemberDao();
		
		List<Member> mList=mDao.memberlist();
		Gson g = new Gson();
		String member = g.toJson(mList);
		if(mList!=null) {
			request.setAttribute("member", member);
		fw.setPath("memberlist.jsp");
		fw.setRedirect(false);
		}
		return fw;
	}

	public Forward membersales() {
		Forward fw = new Forward();
		MemberDao mDao = new MemberDao();
		List<HashMap<String,String>> mList = mDao.membersales();
		Gson g = new Gson();
		String sales = g.toJson(mList);
		request.setAttribute("sales", sales);
		
		fw.setPath("membersales.jsp");
		fw.setRedirect(false);
		return fw;
	}

	public Forward memberjoin() {
		Forward fw = new Forward();
		Member mb = new Member();
		
		mb.setCustno(Integer.parseInt(request.getParameter("custno")));
		System.out.println("custno " + request.getParameter("custno"));
		mb.setCustname(request.getParameter("custname"));
		System.out.println("custname " + request.getParameter("custname"));
		mb.setPhone(request.getParameter("phone"));
		System.out.println("phone " + request.getParameter("phone"));

		mb.setAddress(request.getParameter("address"));
		System.out.println("address " + request.getParameter("address"));

		mb.setJoindate(request.getParameter("joindate"));
		System.out.println("joindate " + request.getParameter("joindate"));

		mb.setGrade(request.getParameter("grade"));
		System.out.println("grade " + request.getParameter("grade"));

		mb.setCity(request.getParameter("city"));
		System.out.println("city " + request.getParameter("city"));

		MemberDao mDao = new MemberDao();
		boolean result = mDao.memberJoin(mb);
		mDao.close();
		if (result) {
			fw.setPath("index.jsp");
			fw.setRedirect(true);
		} else {
			request.setAttribute("msg", "회원가입 실패");
			fw.setPath("Joinfrm.jsp");
			fw.setRedirect(false);
		}
		return fw;
	}

}

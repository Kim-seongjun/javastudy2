package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import been.Member;


@WebServlet("/ajaxTest")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	@SuppressWarnings("unused")
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String cmd=request.getServletPath();
		System.out.println("cmd="+cmd);
		String path=null;
		String json=null;
		switch(cmd) {
		case "/ajaxTest":
//			path="main.jsp";
//			request.setAttribute("id", request.getParameter("id"));
//			request.setAttribute("pw", request.getParameter("pw"));
			Member mb = new Member();
			mb.setId(request.getParameter("id"));
			mb.setPw(request.getParameter("pw")); //DB에서 가져온(갈) 레코드
			System.out.println("id="+mb.getId());
			json = new Gson().toJson(mb);
			System.out.println("json="+json);
			break;
		}

		if(path==null) {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();
			out.write(json);
		}
		if(path!=null) {
			request.getRequestDispatcher(path).forward(request, response);
		}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}

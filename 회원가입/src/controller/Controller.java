package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Age;

@WebServlet("/memberjoin")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String birth = request.getParameter("birth");
		String phone = request.getParameter("first")
					+request.getParameter("second")
					+request.getParameter("third");
		//나이 계산이 복잡하다면???!
		Age a=new Age(); // 나이계산하는 서비스 클래스(비즈니스 로직)
		int age=a.getOperAge(birth);
		//DB Table에 회원정보 저장후 읽어온 정보를 영역에 저장
		request.setAttribute("age", age);
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		request.setAttribute("name", name);
		request.setAttribute("phone", phone);
		
		//위 영역에 값을 응답페이지에 출력
		RequestDispatcher dis=request.getRequestDispatcher("joinResult.jsp");
		dis.forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}

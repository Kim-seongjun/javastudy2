package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ScoreService;

/**
 * Servlet implementation class HomeController
 */
@WebServlet("/score")
public class HomeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		ScoreService ss = new ScoreService();
		String path=ss.execute(request,response);
		//path="/jumsu/result.jsp"
		request.getRequestDispatcher(path).forward(request, response);
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

}

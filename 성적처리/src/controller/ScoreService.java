package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ScoreService {

	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String name = request.getParameter("name");
		int year = Integer.parseInt(request.getParameter("birth").substring(0,4));
		int java = Integer.parseInt(request.getParameter("java"));
		int oracle = Integer.parseInt(request.getParameter("oracle"));
		int web = Integer.parseInt(request.getParameter("web"));
		//성적 결산 작업이 너무 복잡하면 메소드나 클래스 추가
		ScoreOper score = new ScoreOper();
		int age = score.getAge(year);
		int total = score.getTotal(java,oracle,web);
		double avg = score.getAvg(total,3);
		String grade = score.getGrade((int)avg);
		//DB 저장 또는 읽기
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("Java", java);
		request.setAttribute("Oracle", oracle);
		request.setAttribute("Web", web);
		request.setAttribute("total", total);
		request.setAttribute("avg", avg);
		request.setAttribute("grade", grade);
		
		
		
		String path=null;
		path = "jumsu/result.jsp";
		String msg = "";
		if (grade.compareTo("B0")<=0) {
			msg = "당신은 합격입니다.";
		}else {
			msg = "당신은 불합격입니다.";
		}
		request.setAttribute("msg", msg);
		
		return path;
		
		
		/*
		 * if(grade.compareTo("B0")<=0) { path = "jumsu/pass.jsp?grade="+(grade+"%2B");
		 * }else { path = "jumsu/pass.jsp?grade="+grade; }
		 */
		
		
		//return "/jumsu/result.jsp"; //응답페이지 반환
	}
}

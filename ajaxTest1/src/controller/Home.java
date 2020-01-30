package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import been.Member;

/**
 * Servlet implementation class Home
 */
@WebServlet("/member/info")
public class Home extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       request.setCharacterEncoding("utf-8");
       String cmd=request.getServletPath();
       System.out.println("cmd:"+cmd);
       String json=null;
       switch(cmd) {
       case "/member/info":
          String param=request.getParameter("data");
           System.out.println("param:"+param);
           List<Member> mList= new ArrayList<Member>();
           Gson gs=new Gson();
           mList=gs.fromJson(param, new TypeToken<List<Member>>(){}.getType());
           System.out.println("size:"+mList.size());
           System.out.println("mList.get(0).id:"+mList.get(0).getId());
           System.out.println("mList.get(0).pw:"+mList.get(0).getPw());
           json=gs.toJson(mList);
           response.setCharacterEncoding("utf-8");
           response.setContentType("text/html; charset=utf-8"); 
           PrintWriter out= response.getWriter();
           out.print(json);
          break;
       }
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      doProcess(request, response);
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      doProcess(request, response);
   }

}
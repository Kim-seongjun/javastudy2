package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//데이터베이스 유틸
//디비접속,디비종료,tx(commit,rollback)
public class JdbcUtil {
   static {
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
      } catch (ClassNotFoundException e) {
         System.out.println("드라이버 로딩 실패");
         e.printStackTrace();
      }
   }

   // 오라클에서 커넥션 객체를 받아서 반환
   public static Connection getConnection() {
      Connection con = null;
      try {
         con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ICIA", "1111");
         //con.setAutoCommit(false);
         System.out.println("Connection Success!");
      } catch (SQLException se) {
         se.printStackTrace();
      }
      return con;
   }

   public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
      try {
         if (rs != null)
            rs.close();
         if (pstmt != null)
            pstmt.close();
         if (con != null)
            con.close();
      } catch (SQLException e) {
         System.out.println("close 에러");
         e.printStackTrace();
      }
      System.out.println("close ok!");

   }

   public static void commit(Connection con) {
      try {
         con.commit();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   public static void rollback(Connection con) {
      try {
         con.rollback();
      } catch (Exception e) {
      }
   }

}
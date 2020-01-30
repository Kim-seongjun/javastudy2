package com.icia.open.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.icia.open.Bean.Member;

public class MemberDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberDao() {
		con = JdbcUtil.getConnection();
	}

	public void close() {
		JdbcUtil.close(rs, pstmt, con);
	}

	public Member joinfrm() {
		String sql = "SELECT ROWNUM,CUSTNO FROM MEMBER WHERE ROWNUM=1 ORDER BY custno DESC";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			Member mb = new Member();
			if(rs.next()) {
				mb.setCustno(rs.getInt("custno")+1);
				System.out.println("custno = "+rs.getInt("custno"));
			}
			return mb;
			
		} catch (SQLException e) {
			System.out.println("조인 예외");
			e.printStackTrace();
		}
		return null;
	}

	public List<HashMap<String, String>> membersales() {
		String sql = "select * from sales_view";
		try {
			pstmt=con.prepareStatement(sql);
			rs=pstmt.executeQuery();
			List<HashMap<String, String>> sList = new ArrayList<HashMap<String, String>>();
			while(rs.next()) {
				HashMap<String, String> hm = new HashMap<String, String>();
				hm.put("custno",rs.getNString("custno"));	
				hm.put("custname",rs.getNString("custname"));	
				hm.put("grade",rs.getNString("grade"));	
				hm.put("sales",rs.getNString("sales"));	
				sList.add(hm);
				
			}
			return sList;
			
		} catch (SQLException e) {
			System.out.println("매출 예외");
			e.printStackTrace();
		}
		return null;
	}

	

	public boolean memberJoin(Member mb) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?,?,?,?)";
		int result = 0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setInt(1, mb.getCustno());
			pstmt.setNString(2, mb.getCustname());
			pstmt.setNString(3, mb.getPhone());
			pstmt.setNString(4, mb.getAddress());
			pstmt.setNString(5, mb.getJoindate());
			pstmt.setNString(6, mb.getGrade());
			pstmt.setNString(7, mb.getCity());
			
			result = pstmt.executeUpdate();
			if (result != 0) {
				return true;
			}
			System.out.println("회원가입 성공");
		} catch (SQLException e) {
			System.out.println("회원가입 예외처리");
			e.printStackTrace();
		}
		return false;
	}

	public List<Member> memberlist() {
        String sql="SELECT * FROM MEMBER";
        try {
           pstmt=con.prepareStatement(sql);
           rs=pstmt.executeQuery();
           List<Member> mList=new ArrayList<Member>();
           while(rs.next()) {
              Member mb=new Member();
              mb.setCustno(rs.getInt("custno"));
              mb.setCustname(rs.getNString("custname"));
              mb.setPhone(rs.getNString("phone"));
              mb.setAddress(rs.getNString("address"));
              mb.setJoindate(rs.getNString("joindate"));
              mb.setGrade(rs.getNString("grade"));
              mb.setCity(rs.getNString("city"));
              mList.add(mb);
              
           }
           System.out.println("회원 불러오기 성공");
           return mList;
        } catch (SQLException e) {
           System.out.println("회원 불러오기 실패");
           e.printStackTrace();
        }
        return null;
     }
}

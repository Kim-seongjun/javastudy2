package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import been.Member;

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
	public boolean memberJoin(Member mb) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?)";
		int result = 0;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, mb.getId());
			pstmt.setNString(2, mb.getPw());
			pstmt.setNString(3, mb.getName());
			pstmt.setNString(4, mb.getGender());
			result = pstmt.executeUpdate();
			if(result!=0) {
				return true;
			}
		} catch (SQLException e) {
			System.out.println("회원가입 예외(실패)");
			e.printStackTrace();
		}
		return false;
		
	}
	public boolean access(HashMap<String, String> hMap) {
		String sql = "SELECT * FROM MEMBER WHERE ID=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, hMap.get("id"));
			rs = pstmt.executeQuery();
			if(rs.next()) { //아이디가 존재한다면
				if(rs.getNString("PW").equals(hMap.get("pw"))){
					//비번 일치
					return true; //성공
				}
			}
		} catch (SQLException e) {
			System.out.println("로그인 예외");
			e.printStackTrace();
		}
		
		return false; //로그인 실패
	}
}

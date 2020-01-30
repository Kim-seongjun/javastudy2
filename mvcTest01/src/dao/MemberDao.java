package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import been.Member;

public class MemberDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public MemberDao() {
		con=JdbcUtil.getConnection();
	}
	public void close() {
		JdbcUtil.close(rs, pstmt, con);
	}
	public boolean memberJoin(Member mb) {
		String sql = "INSERT INTO MEMBER VALUES(?,?,?,?)";
		int result=0;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setNString(1, mb.getId());
			pstmt.setNString(2, mb.getPw());
			pstmt.setNString(3, mb.getName());
			pstmt.setNString(4, mb.getGender());
			
			result=pstmt.executeUpdate();
			if(result!=0) { //성공시 음수가 반환되는 경우를 봣음
				return true;
			}
		} catch (SQLException e) {
			System.out.println("회원가입 예외(실패)");
			e.printStackTrace();
		}
		return false;
	}
	public boolean access(Member mb) {
		String sql = "SELECT * FROM MEMBER WHERE ID=?";// AND PW = ?";
		try {
			pstmt = con.prepareStatement(sql);//파싱 1번
			pstmt.setNString(1, mb.getId());
			rs=pstmt.executeQuery(); //select만
			if(rs.next()) { //id가 존재한다면
				if(rs.getNString("PW").equals(mb.getPw())) { //비번일치 한다면
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("로그인 예외");
			e.printStackTrace();
		} 
		return false;
	}
}

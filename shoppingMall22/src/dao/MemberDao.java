package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public int access(String id, String pw) {
		String sql="SELECT * FROM MEMBER WHERE ID=?";
		int result = -1;
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setNString(1, id);
			rs=pstmt.executeQuery(); //실행
			if(rs.next()) {
				if(rs.getNString("pw").equals(pw)) {
					result=1; //모두일치시
				}else {
					result=0; //pw 불일치
				}
			}else { //id 불일치
				result=-1;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}

	

	

}

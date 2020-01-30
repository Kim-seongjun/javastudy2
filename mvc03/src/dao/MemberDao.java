package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import bean.History;
import bean.Member;

//회원 DB
public class MemberDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;

	public MemberDao() { //db접속
		con = JdbcUtil.getConnection();
	}

	public void close() { //db 접속해제
		JdbcUtil.close(rs, pstmt, con);
	}

	public boolean memberJoin(Member mb) { //회원가입 인설트
		String sql = "insert into member values(?,?,?,?)";

		try {
			pstmt = con.prepareStatement(sql); // 한번만 파싱
			pstmt.setNString(1, mb.getId());
			pstmt.setNString(2, mb.getPw());
			pstmt.setNString(3, mb.getName());
			pstmt.setNString(4, mb.getGender());
			int result = pstmt.executeUpdate();
			if (result != 0) { // 실패했을때 0을 반환한다.
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	// 로그인
	public boolean access(Member mb) { 
		String sql = "select * from member where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, mb.getId());
			rs = pstmt.executeQuery();
			if (rs.next()) {// 아이디가 존재한다.
				if (rs.getNString("pw").equals(mb.getPw())) {
					System.out.println("로그인 성공");
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("로그인 예외");
			e.printStackTrace();
		}
		System.out.println("로그인 실패");
		return false;
	}
	//로그인 비밀번호 입력창
	public boolean access(HashMap<String, String> hMap) {
		String sql = "SELECT * FROM MEMBER WHERE ID=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, hMap.get("id"));
			rs = pstmt.executeQuery();
			if (rs.next()) {// same id
				if (rs.getNString("pw").equals(hMap.get("pw"))) {
					// 비번일치
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("실패");
			e.printStackTrace();
		}
		return false;
	}

	public List<String> memberList() {
		List<String> mList = null;
		String sql = "SELECT ID FROM MEMBER";
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			mList = new ArrayList<String>();
			while (rs.next()) {
				mList.add(rs.getNString("ID"));
			}
			return mList; // 성공
		} catch (Exception e) {
			System.out.println("list예외");
			e.printStackTrace();

		}
		return null; // 실패
	}

	public Member getInfo(String id) {
		String sql = "select * from member where id=?";

		try {
			Member mb = new Member();
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, id);
			rs = pstmt.executeQuery();

			rs.next();
			mb.setId(rs.getNString("id"));
			mb.setName(rs.getNString("name"));
			mb.setGender(rs.getNString("gender"));
			return mb;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public void delete(String id) {
		String sql = "delete from member where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, id);
			int result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertHistory(History h) {
		String sql = "insert into historytlb values(NO_SEQ.NEXTVAL,?,?,?,TO_CHAR(SYSDATE, 'YYYY-MM-DD HH24:MI:SS'),?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, h.getId());
			pstmt.setNString(2, h.getBrowser());
			pstmt.setNString(3, h.getIp());
			pstmt.setNString(4, h.getAction());

			int result = pstmt.executeUpdate();
			if (result != 0) {
				// 성공 한것!
				System.out.println("인서트 성공");
			}

		} catch (SQLException e) {
			
			e.printStackTrace();
		}

	}

	public ArrayList<History> historyTlb() {
		String sql = "SELECT * FROM HISTORYTLB";
		try {
			
			ArrayList<History> histories = new ArrayList<History>();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()){
				History ht = new History();
				ht.setHistoryId(rs.getInt("HISTORYIDID"));
				System.out.println("인풋"+rs.getInt("HISTORYIDID"));
				ht.setId(rs.getNString("id"));
				ht.setIp(rs.getNString("ip"));
				ht.setBrowser(rs.getNString("browser"));
				ht.setActionTime(rs.getNString("actionTime"));
				ht.setAction(rs.getNString("action"));
				histories.add(ht);
				
			}
			return histories;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
	
	public ArrayList<History> historyTlb(String id) {
		String sql = "SELECT * FROM HISTORYTLB where id=?";
		try {
			
			ArrayList<History> histories = new ArrayList<History>();
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, id);
			rs = pstmt.executeQuery();
			while(rs.next()){
				History ht = new History();
				ht.setHistoryId(rs.getInt("HISTORYIDID"));
				System.out.println("인풋"+rs.getInt("HISTORYIDID"));
				ht.setId(rs.getNString("id"));
				ht.setIp(rs.getNString("ip"));
				ht.setBrowser(rs.getNString("browser"));
				ht.setActionTime(rs.getNString("actionTime"));
				ht.setAction(rs.getNString("action"));
				histories.add(ht);
				
			}
			return histories;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public void deleteHistory(String historyID) {
		String sql = "delete FROM HISTORYTLB where historyidid=?";
		try {
			pstmt=con.prepareStatement(sql);
			pstmt.setNString(1,historyID);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

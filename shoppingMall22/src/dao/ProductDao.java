package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.Product;

public class ProductDao {
	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public ProductDao() {
		con=JdbcUtil.getConnection();
	}
	
	public boolean insertProduct(Product product) {
		String sql = "INSERT INTO P(P_CODE,P_ID,P_NAME,P_PRICE,P_QTY, "
				+"P_CONTENTS,P_DATE,P_ORIFILENAME,P_SYSFILENAME) "
				+"VALUES(?||P_SEQ.NEXTVAL,?,?,?,?,?,SYSDATE,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, product.getP_kind());
			pstmt.setNString(2, product.getP_id());
			pstmt.setNString(3, product.getP_name());
			pstmt.setInt(4, product.getP_price());
			pstmt.setInt(5, product.getP_qty());
			pstmt.setNString(6, product.getP_contents());
			pstmt.setNString(7, product.getP_oriFileName());
			pstmt.setNString(8, product.getP_sysFileName());
			
			int result = pstmt.executeUpdate();
			if(result!=0) { //작업 성공
				System.out.println("상품등록 성공");
				return true;
			}
			
		} catch (SQLException e) {
			System.out.println("상품등록 예외");
			e.printStackTrace();
		} 
		return false;  //상품 등록 실패
	}

	public void close() {
		JdbcUtil.close(rs, pstmt, con);
	}

	public List<Product> getItemList(String kind) {
		String sql = "SELECT * FROM PRODUCT WHERE P_CODE LIKE '%'||?||'%'";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, kind);
			rs = pstmt.executeQuery();
			List<Product> pList = new ArrayList<Product>();
			while(rs.next()) {
				Product product = new Product();
				product.setP_code(rs.getNString("P_CODE"));
				product.setP_sysFileName(rs.getNString("P_SYSFILENAME"));
				pList.add(product);
			}
			return pList;
		} catch (SQLException e) {
			System.out.println("list예외발생");
			e.printStackTrace();
		}
		
		return null;
	}

	public Product getAjaxDetail(String pCode) {
		Product product = new Product();
		String sql = "SELECT * FROM PRODUCT WHERE P_CODE=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, pCode);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				System.out.println(rs.getInt("p_price"));
				product.setP_code(rs.getNString("P_CODE"));
				product.setP_contents(rs.getNString("p_contents"));
				product.setP_id(rs.getNString("p_id"));
				product.setP_name(rs.getNString("p_name"));
				product.setP_price(rs.getInt("p_price"));
				product.setP_qty(rs.getInt("p_qty"));
				product.setP_oriFileName(rs.getNString("p_oriFileName"));
				product.setP_sysFileName(rs.getNString("p_sysFileName"));
				product.setP_date(rs.getDate("P_DATE"));
				
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(product.getP_price());
		System.out.println(product.getP_contents());
		
		
		return product;
		
			
		
		
	}

}

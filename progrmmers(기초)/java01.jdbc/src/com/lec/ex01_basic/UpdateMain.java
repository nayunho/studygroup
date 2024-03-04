package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class UpdateMain {

	final static String DRV ="oracle.jdbc.OracleDriver";
	final static String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	final static String USER ="hr";
	final static String PWD ="hr";
	public static void main(String[] args) {

		Connection conn=null;
		Statement stat =null;
		PreparedStatement pstmt =null;
		ResultSet rs=null;
		String sql="update employees set first_name=?,last_name=? where employee_id=?";
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL,USER,PWD);
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1,"강인");

			pstmt.setString(2,"이");

			pstmt.setInt(3,1000);
			
			int row = pstmt.executeUpdate();
			
			
		} catch (Exception e) {
			System.out.println("DB연결 실패!!");
			e.printStackTrace();
		}finally {
			try {
				if(rs!= null) {
					rs.close();
				}
				if(pstmt!= null) {
					pstmt.close();
				}
				if(conn!= null) {
					conn.close();
				}
			}catch (Exception e) {
				// TODO: handle exception
			}
		}
}
}

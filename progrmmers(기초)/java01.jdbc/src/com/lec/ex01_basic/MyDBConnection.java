package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lec.ex02_Connector.JDBCConnector;

public class MyDBConnection {

	public static void main(String[] args) {
		
		
		PreparedStatement pstmt = null;
		ResultSet rs=null;
		String sql="select * from employees where department_id=?";
		Connection conn=JDBCConnector.getConnection();
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, 100);
			rs=pstmt.executeQuery();
			
			System.out.println("==============================================");
			System.out.println("사원번호	사원		급여	전화번호");
			System.out.println("==============================================");
			while(rs.next()) {
				int employee_id=rs.getInt(1);
				String first_name=rs.getString(2);
				String last_name=rs.getString(3);
				int dpt_id = rs.getInt(8);
				String phone_number = rs.getString(5);
				
				System.out.print(employee_id+"\t");
				System.out.print(first_name+" "+ last_name+"\t");
				System.out.print(dpt_id+"\t");
				System.out.print(phone_number+"\t");
				System.out.println();
			}
		}catch (Exception e) {
			System.out.println("DB연결 실패!!");
			e.printStackTrace();
		}finally {
			JDBCConnector.close(conn, pstmt, rs);
		}
		
		
		
		
		
		
	}

}

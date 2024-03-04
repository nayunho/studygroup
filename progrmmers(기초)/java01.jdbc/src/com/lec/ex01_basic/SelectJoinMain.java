package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectJoinMain {

	final static String DRV ="oracle.jdbc.OracleDriver";
	final static String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	final static String USER ="hr";
	final static String PWD ="hr";
	
	static Connection conn=null;
	static PreparedStatement pstmt =null;
	static Statement stat =null;
	static ResultSet rs=null;
	
	public static void main(String[] args) {
		
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL,USER ,PWD);
			String sql="select * from employees where department_id=?";
			int row=0;
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,100);
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
			
		} catch (Exception e) {
			System.out.println("DB연결 실패!!");
			e.printStackTrace();
		}finally {
			try {
				if(rs!= null) {
					rs.close();
				}
				if(pstmt!= null) {
					stat.close();
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

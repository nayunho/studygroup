package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectOneMain {

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
			String sql="select * from employees where employee_id=? and job_id=?";
			int row=0;
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,100);
			pstmt.setString(2,"AD_PRES");
			rs=pstmt.executeQuery();
			if(rs.next()) {
				int employee_id=rs.getInt(1);
				String first_name=rs.getString(2);
				String last_name=rs.getString(3);
				int salary = rs.getInt(8);
				String phone_number = rs.getString(5);
				
				System.out.println("사원번호="+employee_id);
				System.out.println("사원이름="+first_name+" "+ last_name);
				System.out.println("급여="+salary);
				System.out.println("전화번호="+phone_number);
			}else {
				System.out.println("자료를 찾지 못했습니다.");
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

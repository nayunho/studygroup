package com.lec.ex02_Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnector {
	
	public static Connection getConnection() {
		String DRV ="oracle.jdbc.OracleDriver";
		String URL ="jdbc:oracle:thin:@localhost:1521:xe";
		String USER ="hr";
		String PWD ="hr";
		Connection conn = null;
		try {
			Class.forName(DRV);
			conn=DriverManager.getConnection(URL,USER ,PWD);
		} catch (Exception e) {
			return null;
		}
		
		return conn;
	}
	
	public static void close(Connection conn, Statement stat, ResultSet rs) {
		try {
			if(rs!= null) {
				rs.close();
			}
			if(stat!= null) {
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

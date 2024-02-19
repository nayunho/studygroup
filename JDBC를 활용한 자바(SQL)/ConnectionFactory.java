package com.lec.board;

import java.io.FileReader;
import java.net.URL;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
		private String path = ConnectionFactory.class.getResource("JDBC_application.properties").getPath();
		private String DRV=null;
		private String URL=null;
		private String USR=null;
		private String PWD=null;
		
		private String insert=null;
		private String selct=null;
		private String update=null;
		private String delete=null;
		
		public ConnectionFactory() {
			try {
				setUp();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void setUp() throws Exception {
			Properties p =new Properties();
			path = URLDecoder.decode(path,"utf-8");
			p.load(new FileReader(path));
			
			//1.DB접속정보
			DRV=p.getProperty("DRV");
			URL=p.getProperty("URL");
			USR=p.getProperty("USR");
			PWD=p.getProperty("PWD");
			
			insert=p.getProperty("insert");
			selct=p.getProperty("selct");
			update=p.getProperty("update");
			delete=p.getProperty("delete");
			/*
			System.out.println(DRV);
			System.out.println(URL);
			System.out.println(USR);
			System.out.println(PWD);
			
			System.out.println(insert);
			System.out.println(update);
			System.out.println(update);
			System.out.println(delete);
			*/
			Class.forName(DRV);
			
	}
		
		public Connection getConnection() {

			try {
				
				return DriverManager.getConnection(URL,USR,PWD);
			} catch (SQLException e) {
				System.out.println("db연결 실패");
				e.printStackTrace();
				return null;
			}
		}

		public String getInsert() {
			return insert;
		}

		public String getSelct() {
			return selct;
		}

		public String getUpdate() {
			return update;
		}

		public String getDelete() {
			return delete;
		}

		
		
}

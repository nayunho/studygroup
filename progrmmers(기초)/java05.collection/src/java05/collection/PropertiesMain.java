package java05.collection;

import java.beans.Statement;
import java.io.FileReader;
import java.net.URLDecoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) throws Exception {
		
		//파일읽기
		//1.파일경로
		String path = PropertiesMain.class.getResource("JDBCConnector.properties").getPath();

		path = URLDecoder.decode(path,"utf-8");
		
		System.err.println(path);
		
		//2.파일읽기
		Properties properties = new Properties();
		properties.load(new FileReader(path));
		
		//3. key와 values
		String DRV = properties.getProperty("DRV");
		String URL = properties.getProperty("URL");
		String USER = properties.getProperty("USR");
		String PWD = properties.getProperty("PWD");
		System.out.println(DRV);
		System.out.println(URL);
		System.out.println(USER);
		System.out.println(PWD);
		
			Class.forName(DRV);
			Connection conn = DriverManager.getConnection(URL,USER ,PWD);
			java.sql.Statement stat = conn.createStatement(); 
			ResultSet rs=stat.executeQuery("select * from employees where emp_no=100");
			rs.next();
			
			int employee_id = rs.getInt(1);
			String first_name = rs.getString(3);
			String last_name = rs.getString("LAST_NAME");//String last_name = rs.getString(3);
			String gender = rs.getString("gender");//int salary = rs.getInt(4);
			System.out.println(employee_id+","+first_name+","+last_name+","+gender);
			
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

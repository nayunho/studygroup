package com.lec.ex01_basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCConnection {

	/* JDBC를 이용한 JAVA와 DB 연동하기
	 * JAVA와 DB를 연동하기 위해서는 각 RDBMS의 버전에 맞는 JRE실행환경 라이브러리를 JAVA프로젝트에
	 * 추가해야한다. JDBC드라이버는 DB버전에 맞는 JDBC드라이버(오라클은 ojdbc8.jar등을)추가해야한다.
	 * (Oracle JDBC의 버전별로 참고 사이트 ) 
	 * 
	 * A.라이브러리를 추가하는 방법
	 * 	1.JAVA project우클릭
	 * 	2. build path > Add Build path
	 * 		or build path > Configure Build Path > (tab)Libraries > 
	 * (button) Add jar ...(내프로젝트안에있는 자바 파일) or add external(외부에 있는 파일)
	 * > (button) Apply &close 
	 * 
	 * B. JDBC 프로그램 작성단계
	 * 		1. JDBC 드라이버 로딩(DB에 따라 드라이버가 상이)
	 * 			a. Oracle  : Class.forName("oracle.jdbc.OracleDriver");
	 * 			b. maraidb : Class.forName("org.maraidb.jdbc.Driver");
	 * 			c. mysql : Class.forName("com.mysql.jdbc.Driver");
	 * 
	 * 			*참고
	 * 			Class.forName()메서드는 클래스파일(*.class)파일을 읽어서
	 * 			자동으로 객체를 생성해주는 메서드이다.
	 * 			DB드라이버를 로딩하면 DriverManager에 등록이 된다.
	 * 
	 * 		2. Connection객체를 생성
	 * 		Connection객체에 연결하는 것은 DriverManager에 등록된 각 드라이버를
	 * 		getConnection()메서드를 이용해서 식별한다.
	 * 		getConnection의 매개값은 "DB의 URL 주소,사용자 ID,비밀번호"를 전달한다.
	 * 		연결할떄 URL식별자 정보를 이용해서 Mapping을 하고 찾지 못했을 경우에는
	 * 		에러가 발생한다. getConnection()메서드의 결과는 Connection객체로 리턴한다.
	 * 
	 * 		getConnection(String url,String user, String password);
	 * 		
	 * 		a. oracle : getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
	 * 		b. mariadb : getConnection("jdbc:mariadb://localhost:3308/db이름","root","12345");
	 * 		c. mysql : getConnection("jdbc:mysql://localhost:3307/db이름","root","12345");
	 * 
	 * 		3. Statement(Statement/PreparedStatement)
	 * 
	 * 			SQL생성 및 실행을 하변 반환된 결과를 가져고에할 작업영역을 제공한다. Statement객체는
	 * 			Connection객체의 cerateStatement()메서드를 사용하여 생성한다.
	 * 
	 * 			이 단계부터는 JDBC드라이버에 구애를 받지 않는다. 즉, DB와 상관없이 동일한 명령으로 사용할 수 있다.
	 * 			단, SQL표준문법을 준수할 경우에는 동일한 SQL명령을 사용할수 있다.
	 * 			DB마다 고유한 SQL명령이라면 각 DB의 문법의 맞게 작성되어야한다.
	 * 
	 * 			Statement stat = conn.createStatement();
	 * 			PreparedStatement pstat = conn.createStatement();
	 * 			callableStatement cstat = conn.preparedCall("{call 스토어프로시저명 (?,?,?,?)}");
	 * 			=>모두가 동일한 코드로 작성 가능
	 * 			
	 * 			Statement=>select * from xxx where id=10;
	 * 			PreparedStatement=>select * from xxx where id=?;
	 * 
	 * 		4. Query실행
	 * 			Statement객체가 생성된 후에 Statement객체의 executeQusery(),executeUpdate()메서드를 사용하여
	 * 			처리한다. 이객체는ResultSet이라는 객체를 리턴한다.
	 * 			
	 * 			ResultSet rs = stat.executeQuery("select * from user");
	 * 
	 * 			ResultSet rs = pstat.executeQuery("select * from user where id=? and name = ?");
	 * 
	 *  		ResultSet rs = cstat.executeQuery("select * from user where id=? and name = ?");
	 * 
	 * */	
	final static String DRV ="oracle.jdbc.OracleDriver";
	final static String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	final static String USER ="hr";
	final static String PWD ="hr";
	public static void main(String[] args) {
		
		Connection conn=null;
		Statement stat =null;
		ResultSet rs=null;
		String sql="select * from employees where employee_id=100";
		try {
			Class.forName(DRV);
			conn = DriverManager.getConnection(URL,USER ,PWD);
			stat = conn.createStatement(); 
			rs=stat.executeQuery(sql);
			rs.next();
			
			int employee_id = rs.getInt(1);
			String first_name = rs.getString(2);
			String last_name = rs.getString("LAST_NAME");//String first_name = rs.getString(3);
			int salary = rs.getInt("SALARY");//String first_name = rs.getString(4);
			
			System.out.println(employee_id+","+first_name+","+last_name+","+salary);
			
		} catch (Exception e) {
			System.out.println("DB연결 실패!!");
			e.printStackTrace();
		}finally {
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

}

package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜 : 2022/01/13
 * 이름 : 김유경
 * 내용 : 자바 Delete 실습하기 교재 p557
 */

public class Sub4_DeleteTest {
	
	public static void main(String[] args) {
		
	
	//DB정보
	final String HOST = "jdbc:mysql://54.180.160.240:3306/kkomang0622";
	final String USER = "kkomang0622";
	final String PASS = "1234";
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(HOST,USER,PASS);
		
		Statement stmt = conn.createStatement();
		
		String sql = "DELETE FROM `User1` WHERE `uid`='P101';";
		int count = stmt.executeUpdate(sql);
		
		System.out.println(count +"개의 데이터가 삭제 되었습니다." );
		
		conn.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("Delete 완료!");
	}

}

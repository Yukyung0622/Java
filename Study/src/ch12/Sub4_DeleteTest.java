package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * ��¥ : 2022/01/13
 * �̸� : ������
 * ���� : �ڹ� Delete �ǽ��ϱ� ���� p557
 */

public class Sub4_DeleteTest {
	
	public static void main(String[] args) {
		
	
	//DB����
	final String HOST = "jdbc:mysql://54.180.160.240:3306/kkomang0622";
	final String USER = "kkomang0622";
	final String PASS = "1234";
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection conn = DriverManager.getConnection(HOST,USER,PASS);
		
		Statement stmt = conn.createStatement();
		
		String sql = "DELETE FROM `User1` WHERE `uid`='P101';";
		int count = stmt.executeUpdate(sql);
		
		System.out.println(count +"���� �����Ͱ� ���� �Ǿ����ϴ�." );
		
		conn.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	System.out.println("Delete �Ϸ�!");
	}

}

package ch12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		
		//DB����
				final String HOST = "jdbc:mysql://54.180.160.240:3306/kkomang0622";
				final String USER = "kkomang0622";
				final String PASS = "1234";
				
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(HOST,USER,PASS);
			Statement stmt = conn.createStatement();
			String sql = "INSERT INTO `User1` VALUES ('C101', '���缮', '010-1110-1235', 40);";
			String sql1 = "INSERT INTO `User1` VALUES ('D102', '�̱���', '010-2200-0012', 31);";
			int count = stmt.executeUpdate(sql);
			int count1 = stmt.executeUpdate(sql1);
			
			System.out.println(count + "�� �߰� �Ǿ����ϴ�.");
			System.out.println(count1 + "�� �߰� �Ǿ����ϴ�.");
			
			conn.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("insert �Ϸ�!");
		
	}
}

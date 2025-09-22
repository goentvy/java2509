package kr.entvy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyMain {

	public static void main(String[] args) {
		Connection conn = null;
		String url = "jdbc:mariadb://localhost:3306/employees";
		String user = "root";
		String password = "9785";
		
		try {
			// JDBC 드라이브 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			// 연결시도
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("MariaDB 연결 성공!");
			
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT NOW() AS now_time");
			
			while(rs.next()) {
				String nowTime = rs.getString("now_time");
				System.out.println("현재 시각: " + nowTime);
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패: " + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("DB 연결 실패: " + e.getMessage());
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결 끊기");
				} catch (SQLException e) {}
			}
		}
	}
}

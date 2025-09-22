package kr.entvy.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {

	public static void main(String[] args) {
		String url = "jdbc:mariadb://localhost:3306/employees";
		String user = "root";
		String password = "9785";
		
		Connection conn = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			
			conn = DriverManager.getConnection(url, user, password);
//			// Table 생성
//			String createTableSQL = "" +
//					"CREATE TABLE IF NOT EXISTS users (" +
//					"userid VARCHAR(20) PRIMARY KEY, " +
//					"username VARCHAR(50), " +
//					"userpassword VARCHAR(100), " +
//					"userage INT, " +
//					"useremail VARCHAR(100)" +
//					")";
//			
//			PreparedStatement createStmt = conn.prepareStatement(createTableSQL);
//			createStmt.execute();
//			createStmt.close();
			
			String sql = "" +
					"INSERT INTO users (userid, username, userpassword, userage, useremail) " + "VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "summer");
			pstmt.setString(2, "한여름");
			pstmt.setString(3, "45678");
			pstmt.setInt(4, 20);
			pstmt.setString(5, "summer@mycompany.com");
			
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 행 수: " + rows);
			
			pstmt.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

package entvy.lee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	// DB 접속 정보
	static final String DB_URL = "jdbc:mariadb://localhost:3306/employees";
	static final String USER = "root";
	static final String PASSWORD = "9785";
	
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
			System.out.println("----- MariaDB 연결 성공 -----");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("===== DB 연결 실패 =====");
		}
		return conn;
	}
	
	public static void close(Statement stmt, Connection conn) {
		try {
	        if (stmt != null) stmt.close();
	    } catch (SQLException e) {
	        System.out.println("Statement 닫기 실패: " + e.getMessage());
	    }

	    try {
	        if (conn != null) conn.close();
	    } catch (SQLException e) {
	        System.out.println("Connection 닫기 실패: " + e.getMessage());
	    }
	}
	
	public static void close(PreparedStatement pstmt, Connection conn) {
		try {
	        if (pstmt != null) pstmt.close();
	    } catch (SQLException e) {
	        System.out.println("PreparedStatement 닫기 실패: " + e.getMessage());
	    }

	    try {
	        if (conn != null) conn.close();
	    } catch (SQLException e) {
	        System.out.println("Connection 닫기 실패: " + e.getMessage());
	    }
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
	        if (rs != null) rs.close();
	    } catch (SQLException e) {
	        System.out.println("ResultSet 닫기 실패: " + e.getMessage());
	    }
		try {
	        if (pstmt != null) pstmt.close();
	    } catch (SQLException e) {
	        System.out.println("PreparedStatement 닫기 실패: " + e.getMessage());
	    }

	    try {
	        if (conn != null) conn.close();
	    } catch (SQLException e) {
	        System.out.println("Connection 닫기 실패: " + e.getMessage());
	    }
	}
}

package entvy.lee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.sql.Date;

public class CRUDClass {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public CRUDClass() {
//		Create Table - create table
//		createTable();
		
//		Update Table - update table
//		updateTable();
		
//		Delete Table in row - delete
//		deleteUser();
		
//		insert
//		insertUser();
		
//		Drop Table - drop table
//		dropTable();
		
//		Read Table - select
		selectTable();
	}

	private void dropTable() {
		String sql = "DROP TABLE users";
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수: " + rows);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
	}

	private void insertUser() {
		String sql = "INSERT INTO users(id, name, email, hire_date) VALUES(?, ?, ?, ?)";
		try {
			LocalDate today = LocalDate.now();
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, 1);
			pstmt.setString(2, "이주환");
			pstmt.setString(3, "steal97@naver.com");
			pstmt.setDate(4, Date.valueOf(today));
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
	}

	private void deleteUser() {
		String sql = "DELETE FROM users";
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수: " + rows);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(pstmt, conn);
		}
	}

	private void updateTable() {
		
	}

	private void selectTable() {
		String sql = "show tables";
		
		try {
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("----- employees 데이터베이스 내부 테이블 확인 -----");
			
			while(rs.next()) {
				String talName = rs.getString("tables_in_employees");
				String talName2 = rs.getString(1);
				System.out.println("[" + talName + "--" + talName2 + "]");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBConnection.close(rs, pstmt, conn);
		}
	}

	private void createTable() {
		String createTableSQL = """
			CREATE TABLE IF NOT EXISTS users (
				id INT PRIMARY KEY AUTO_INCREMENT,
				name VARCHAR(100) NOT NULL,
				email VARCHAR(100),
				hire_date DATE
			);
		""";
		
		try { 
			conn = DBConnection.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(createTableSQL);
		} catch (Exception e) {
			System.out.println("테이블 생성 실패: " + e.getMessage());
			e.printStackTrace();
		} finally {
			DBConnection.close(stmt, conn);
		}
	}
}

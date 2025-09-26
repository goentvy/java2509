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
		selectUsers();
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
		String sql = "INSERT INTO users(name, email, hire_date) VALUES(?, ?, ?)";
		try {
			LocalDate today = LocalDate.now();
			conn = DBConnection.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "박근철");
			pstmt.setString(2, "park@naver.com");
			pstmt.setDate(3, Date.valueOf(today));
			
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
	    String sql = "UPDATE users SET name = ?, email = ? WHERE name = ? AND email = ?";
	    try {
	        conn = DBConnection.getConnection();
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setString(1, "홍길동");
	        pstmt.setString(2, "hong@example.com");
	        pstmt.setString(3, "이주환"); // 조건 name
	        pstmt.setString(4, "steal97@naver.com"); // 조건 email

	        int rows = pstmt.executeUpdate();
	        if (rows == 0) {
	            System.out.println("조건에 맞는 사용자가 존재하지 않습니다.");
	        } else {
	            System.out.println("수정된 행 수: " + rows);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        DBConnection.close(pstmt, conn);
	    }
	}

	private void selectUsers() {
	    String sql = "SELECT * FROM users";
	    try {
	        conn = DBConnection.getConnection();
	        pstmt = conn.prepareStatement(sql);
	        rs = pstmt.executeQuery();

	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("name");
	            String email = rs.getString("email");
	            Date hireDate = rs.getDate("hire_date");

	            System.out.printf("ID: %d, 이름: %s, 이메일: %s, 입사일: %s%n", id, name, email, hireDate);
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

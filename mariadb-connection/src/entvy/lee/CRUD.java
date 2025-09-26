package entvy.lee;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import entvy.lee.DBConnection;

public class CRUD {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public CRUD() {}
	
	// 테이블 생성
	public void createTable() {
		String createTableSQL = """
			CREATE TABLE IF NOT EXISTS users (
				id INT PRIMARY KEY AUTO_INCREMENT,
				name VARCHAR(100) NOT NULL UNIQUE,
				email VARCHAR(100) UNIQUE,
				hireDate DATE
			);
		""";
		
		try(Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement()) {
			
			stmt.executeUpdate(createTableSQL);
		} catch (Exception e) {
			System.out.println("테이블 생성 실패: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// users 테이블 조회
	public void selectUsers() {
	    String sql = "SELECT * FROM users";
	    try(Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
    		ResultSet rs = pstmt.executeQuery()) {
	    	
	        while (rs.next()) {
	            int id = rs.getInt("id");
	            String name = rs.getString("name");
	            String email = rs.getString("email");
	            Date hireDate = rs.getDate("hireDate");

	            System.out.printf("ID: %d, 이름: %s, 이메일: %s, 입사일: %s%n", id, name, email, hireDate);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// users 테이블 데이터 업데이트
	public void updateUser(User user, String name, String email) {
	    String sql = "UPDATE users SET name = ?, email = ? WHERE name = ? AND email = ?";
	    try(Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
	    	
	        pstmt.setString(1, user.getName());
	        pstmt.setString(2, user.getEmail());
	        pstmt.setString(3, name); // 조건 name
	        pstmt.setString(4, email); // 조건 email

	        int rows = pstmt.executeUpdate();
	        if (rows == 0) {
	            System.out.println("조건에 맞는 사용자가 존재하지 않습니다.");
	        } else {
	            System.out.println("수정된 행 수: " + rows);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// users 테이블 데이터 전체 삭제
	public void deleteUser() {
		String sql = "DELETE FROM users";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수: " + rows);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// user 테이블 데이터 삽입
	public void insertUser(User user) {
		String sql = "INSERT INTO users(name, email, hireDate) VALUES(?, ?, ?)";
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setDate(3, Date.valueOf(user.getHireDate()));
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// 테이블 삭제
	public void dropTable() {
		String sql = "DROP TABLE IF EXISTS users";
		
		try(Connection conn = DBConnection.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql)) {
			
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수: " + rows);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void dropTable(String table) {
		if(!table.matches("^[a-zA-Z0-9_]+$")) {
			throw new IllegalArgumentException("허용되지 않는 테이블 이름입니다.");
		}
		String sql = "DROP TABLE IF EXISTS " + table;
		
		try(Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement()) {
			
			stmt.executeUpdate(sql);
			System.out.println("테이블 삭제 완료. " + table);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

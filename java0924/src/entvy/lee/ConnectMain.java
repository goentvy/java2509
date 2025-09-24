package entvy.lee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectMain {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			// JDBC 드라이브 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			CRUDClass crudClass = new CRUDClass();
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패: " + e.getMessage());
			e.printStackTrace();
		} finally {
		    try { if (rs != null) rs.close(); } catch (SQLException e) {}
		    try { if (stmt != null) stmt.close(); } catch (SQLException e) {}
		    try { if (conn != null) conn.close(); } catch (SQLException e) {}
		}
	}
}

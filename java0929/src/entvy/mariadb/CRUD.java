package entvy.mariadb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class CRUD {
	Connection conn = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet rs = null;
	
	public CRUD() {}
	
	// 테이블 생성
	public void createTable(String type) {
		String member = """
			CREATE TABLE Member(
				MemberID INT PRIMARY KEY,
				Name VARCHAR(255) NOT NULL,
				Phone VARCHAR(255),
				Address VARCHAR(255)
			);
		""";
		
		String rental = """
			CREATE TABLE Rental(
				RentalID INT,
				MemberID INT,
				BookID INT,
				RentDate YEAR,
				ReturnDate YEAR,
				PRIMARY KEY(RentalID),
				FOREIGN KEY(MemberID) REFERENCES member(MemberID),
				FOREIGN KEY(BookID) REFERENCES book(BookID)
			);
		""";
		
		String book = """
			CREATE TABLE Book(
				BookID INT AUTO_INCREMENT PRIMARY KEY,
				Title VARCHAR(255) NOT NULL,
				Author VARCHAR(255),
				Publisher VARCHAR(255),
				Price INT,
				PubYear YEAR
			);
		""";
		
		String employee = """
	        CREATE TABLE Employee (
	            EmpNo INT PRIMARY KEY AUTO_INCREMENT,
	            EmpName VARCHAR(30) NOT NULL UNIQUE,
	            Dept VARCHAR(20) NOT NULL,
	            HireDate DATE NOT NULL,
	            Salary INT,
	            CONSTRAINT CHECK_SALARY CHECK (Salary >= 2000000)
	        );
	    """;

		
		try(Connection conn = DBConnection.getConnection();
			Statement stmt = conn.createStatement()) {
			
			switch (type.toLowerCase()) {
	            case "member" -> stmt.executeUpdate(member);
	            case "rental" -> stmt.executeUpdate(rental);
	            case "book" -> stmt.executeUpdate(book);
	            case "employee" -> stmt.executeUpdate(employee);
	            default -> System.out.println("지원하지 않는 테이블 타입입니다: " + type);
	        }
			
		} catch (Exception e) {
			System.out.println("테이블 생성 실패: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	// member 테이블 조회
	public void selectTable(String type) {
	    String sql = switch (type.toLowerCase()) {
	        case "member" -> "SELECT * FROM member";
	        case "rental" -> "SELECT * FROM rental";
	        case "book" -> "SELECT * FROM book";
	        case "employee" -> "SELECT * FROM employee";
	        default -> null;
	    };

	    if (sql == null) {
	        System.out.println("지원하지 않는 테이블입니다: " + type);
	        return;
	    }

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        switch (type.toLowerCase()) {
	            case "member" -> {
	                while (rs.next()) {
	                    System.out.printf("ID: %d, 이름: %s, 폰: %s, 주소: %s%n",
	                        rs.getInt("memberid"), rs.getString("name"),
	                        rs.getString("phone"), rs.getString("address"));
	                }
	            }
	            case "rental" -> {
	                while (rs.next()) {
	                    System.out.printf("대출번호: %d, 회원ID: %d, 도서ID: %d, 대출일: %s, 반납일: %s%n",
	                        rs.getInt("rentalid"), rs.getInt("memberid"),
	                        rs.getInt("bookid"), rs.getString("rentdate"),
	                        rs.getString("returndate"));
	                }
	            }
	            case "book" -> {
	                while (rs.next()) {
	                    System.out.printf("도서ID: %d, 제목: %s, 저자: %s, 출판사: %s, 가격: %d, 출판년도: %s%n",
	                        rs.getInt("bookid"), rs.getString("title"),
	                        rs.getString("author"), rs.getString("publisher"),
	                        rs.getInt("price"), rs.getString("pubyear"));
	                }
	            }
	            case "employee" -> {
	                while (rs.next()) {
	                    System.out.printf("사번: %d, 이름: %s, 부서: %s, 입사일: %s, 급여: %d%n",
	                        rs.getInt("empno"), rs.getString("empname"),
	                        rs.getString("dept"), rs.getString("hiredate"),
	                        rs.getInt("salary"));
	                }
	            }
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// member 테이블 데이터 업데이트
	public void updateData(String type, Object data, String... condition) {
	    try (Connection conn = DBConnection.getConnection()) {
	        switch (type.toLowerCase()) {
	            case "member" -> {
	                String sql = "UPDATE member SET name = ?, address = ? WHERE name = ? AND address = ?";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Member member = (Member) data;
	                    pstmt.setString(1, member.getName());
	                    pstmt.setString(2, member.getAddress());
	                    pstmt.setString(3, condition[0]); // 기존 name
	                    pstmt.setString(4, condition[1]); // 기존 address
	                    int rows = pstmt.executeUpdate();
	                    System.out.printf("Member 수정된 행 수: %d%n", rows);
	                }
	            }
	            
	            case "book" -> {
	                String sql = "UPDATE book SET title = ?, author = ? WHERE title = ?";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Book book = (Book) data;
	                    pstmt.setString(1, book.getTitle());
	                    pstmt.setString(2, book.getAuthor());
	                    pstmt.setString(3, condition[0]); // 기존 title
	                    int rows = pstmt.executeUpdate();
	                    System.out.printf("Book 수정된 행 수: %d%n", rows);
	                }
	            }
	            
	            case "rental" -> {
	                String sql = "UPDATE rental SET returndate = ? WHERE rentalid = ?";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Rental rental = (Rental) data;
	                    pstmt.setString(1, rental.getReturnDate());
	                    pstmt.setInt(2, rental.getRentalID());
	                    int rows = pstmt.executeUpdate();
	                    System.out.printf("Rental 수정된 행 수: %d%n", rows);
	                }
	            }
	            
	            case "employee" -> {
	                String sql = "UPDATE employee SET salary = ? WHERE empname = ?";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Employee emp = (Employee) data;
	                    pstmt.setInt(1, emp.getSalary());
	                    pstmt.setString(2, condition[0]); // 기존 이름
	                    int rows = pstmt.executeUpdate();
	                    System.out.printf("Employee 수정된 행 수: %d%n", rows);
	                }
	            }

	            default -> System.out.println("지원하지 않는 타입입니다: " + type);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// member 테이블 데이터 전체 삭제
	public void deleteData(String type) {
	    String sql = switch (type.toLowerCase()) {
	        case "member" -> "DELETE FROM member";
	        case "book" -> "DELETE FROM book";
	        case "rental" -> "DELETE FROM rental";
	        case "employee" -> "DELETE FROM employee";
	        default -> null;
	    };

	    if (sql == null) {
	        System.out.println("지원하지 않는 테이블입니다: " + type);
	        return;
	    }

	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql)) {

	        int rows = pstmt.executeUpdate();
	        System.out.printf("%s 테이블에서 삭제된 행 수: %d%n", type, rows);

	    } catch (Exception e) {
	        System.out.println("삭제 실패: " + e.getMessage());
	        e.printStackTrace();
	    }
	}
	
	// 테이블 데이터 삽입
	public void insertData(String type, Object data) {
	    try (Connection conn = DBConnection.getConnection()) {
	        switch (type.toLowerCase()) {
	            case "member" -> {
	                String sql = "INSERT INTO member(memberid, name, phone, address) VALUES(?, ?, ?, ?)";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Member member = (Member) data;
	                    pstmt.setInt(1, member.getMemberid());
	                    pstmt.setString(2, member.getName());
	                    pstmt.setString(3, member.getPhone());
	                    pstmt.setString(4, member.getAddress());
	                    pstmt.executeUpdate();
	                    System.out.println("Member 삽입 완료");
	                }
	            }
	            case "book" -> {
	                String sql = "INSERT INTO book(title, author, publisher, price, pubyear) VALUES(?, ?, ?, ?, ?)";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Book book = (Book) data;
	                    pstmt.setString(1, book.getTitle());
	                    pstmt.setString(2, book.getAuthor());
	                    pstmt.setString(3, book.getPublisher());
	                    pstmt.setInt(4, book.getPrice());
	                    pstmt.setString(5, book.getPubYear());
	                    pstmt.executeUpdate();
	                    System.out.println("Book 삽입 완료");
	                }
	            }
	            case "rental" -> {
	                String sql = "INSERT INTO rental(rentalid, memberid, bookid, rentdate, returndate) VALUES(?, ?, ?, ?, ?)";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Rental rental = (Rental) data;
	                    pstmt.setInt(1, rental.getRentalID());
	                    pstmt.setInt(2, rental.getMemberID());
	                    pstmt.setInt(3, rental.getBookID());
	                    pstmt.setString(4, rental.getRentDate());
	                    pstmt.setString(5, rental.getReturnDate());
	                    pstmt.executeUpdate();
	                    System.out.println("Rental 삽입 완료");
	                }
	            }
	            case "employee" -> {
	                String sql = "INSERT INTO employee(empname, dept, hiredate, salary) VALUES (?, ?, ?, ?)";
	                try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
	                    Employee emp = (Employee) data;
	                    pstmt.setString(1, emp.getEmpName());
	                    pstmt.setString(2, emp.getDept());
	                    pstmt.setString(3, emp.getHireDate());
	                    pstmt.setInt(4, emp.getSalary());
	                    pstmt.executeUpdate();
	                    System.out.println("Employee 삽입 완료");
	                }
	            }
	            default -> System.out.println("지원하지 않는 타입입니다: " + type);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// 테이블 삭제
	public void dropTable(String table) {
		table = table.toLowerCase();
		if(!table.matches("^[a-zA-Z0-9_]+$")) {
			throw new IllegalArgumentException("허용되지 않는 테이블 이름입니다.");
		}
		List<String> allowedTables = List.of("member", "book", "rental");
		if (!allowedTables.contains(table.toLowerCase())) {
		    throw new IllegalArgumentException("삭제가 허용되지 않은 테이블입니다.");
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
	
	// 공통 출력 로직 헬퍼메서드
	private void printResultSet(ResultSet rs, String... columns) throws SQLException {
	    while (rs.next()) {
	        for (String col : columns) {
	            System.out.print(rs.getString(col) + "\t");
	        }
	        System.out.println();
	    }
	}
	
//	Book 문제 result 메소드
	
//	-- (1) 2020년 이후 출판된 도서를 검색하시오.
	public void bookResult1() {
	    String sql = "SELECT * FROM book WHERE pubyear >= 2020";
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        printResultSet(rs, "bookid", "title", "pubyear");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

//	-- (2) '홍길동' 회원이 대출한 도서 목록을 출력하시오.
	public void bookResult2() {
	    String sql = """
	        SELECT b.title, b.author, r.rentdate, r.returndate
	        FROM rental r
	        JOIN member m ON r.memberid = m.memberid
	        JOIN book b ON r.bookid = b.bookid
	        WHERE m.name = '홍길동'
	    """;
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        printResultSet(rs, "title", "author", "rentdate", "returndate");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
//	-- (3) 반납하지 않은 도서를 검색하시오.
	public void bookResult3() {
	    String sql = """
	        SELECT r.rentalid, m.name, b.title, r.rentdate
	        FROM rental r
	        JOIN member m ON r.memberid = m.memberid
	        JOIN book b ON r.bookid = b.bookid
	        WHERE r.returndate IS NULL
	    """;
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        printResultSet(rs, "rentalid", "name", "title", "rentdate");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
//	-- (4) 도서별 대출 횟수를 출력하시오.
	public void bookResult4() {
	    String sql = """
	        SELECT b.title, COUNT(*) AS rent_count
	        FROM rental r
	        JOIN book b ON r.bookid = b.bookid
	        GROUP BY b.title
	        ORDER BY rent_count DESC
	    """;
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        printResultSet(rs, "title", "rent_count");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
//	-- (5) 가격이 가장 비싼 도서를 출력하시오.
	public void bookResult5() {
	    String sql = """
	        SELECT * FROM book
	        WHERE price = (SELECT MAX(price) FROM book)
	    """;
	    try (Connection conn = DBConnection.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(sql);
	         ResultSet rs = pstmt.executeQuery()) {

	        printResultSet(rs, "bookid", "title", "price");

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
//	Employee 문제 result 메소드
	
	//개발부 사원 조회
	public void empolyeeResult1() {
	 String sql = "SELECT empno, empname, salary FROM employee WHERE dept = '개발부'";
	 try (Connection conn = DBConnection.getConnection();
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      ResultSet rs = pstmt.executeQuery()) {
	     printResultSet(rs, "empno", "empname", "salary");
	 } catch (Exception e) {
	     e.printStackTrace();
	 }
	}

	//급여 300만 이상 사원 조회
	public void empolyeeResult2() {
	 String sql = "SELECT empname, dept FROM employee WHERE salary >= 3000000";
	 try (Connection conn = DBConnection.getConnection();
	      PreparedStatement pstmt = conn.prepareStatement(sql);
	      ResultSet rs = pstmt.executeQuery()) {
	     printResultSet(rs, "empname", "dept");
	 } catch (Exception e) {
	     e.printStackTrace();
	 }
	}
}













































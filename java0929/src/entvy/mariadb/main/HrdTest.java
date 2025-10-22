package entvy.mariadb.main;

import entvy.mariadb.Book;
import entvy.mariadb.CRUD;
import entvy.mariadb.Employee;
import entvy.mariadb.Member;
import entvy.mariadb.Rental;

public class HrdTest {

	public static void main(String[] args) {
		try {
			// JDBC 드라이브 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			CRUD crud = new CRUD();
			
			// member 테이블 데이터 생성
			Member member = new Member(4, "김김김", "010-5555-5555", "kim@naver.com");
			
			// rental 테이블 데이터 생성
			Rental rental = new Rental(105, 4, 3, "2019", "2020");
			
			// book 테이블 데이터 생성
			Book book = new Book(7, "도서7", "저자7", "출판사7", 4000, "2025");
			
			// Employee 테이블 데이터 생성
			Employee employeeHong = new Employee(1, "홍길동", "영업부", "2020-03-01", 2500000);
			Employee employeeLee = new Employee(2, "이순신", "인사부", "2019-07-15", 3200000);
			Employee employeeGang = new Employee(3, "강감찬", "개발부", "2021-01-10", 2800000);
			
//			crud.dropTable("member");
//			crud.createTable("rental");
//			crud.insertData("book", book);
//			crud.selectTable("member");
//			crud.bookResult1();
//			crud.bookResult2();
//			crud.bookResult3();
//			crud.bookResult4();
//			crud.bookResult5();
			crud.empolyeeResult1();
			crud.empolyeeResult2();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

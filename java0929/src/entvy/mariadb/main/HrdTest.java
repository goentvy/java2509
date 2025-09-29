package entvy.mariadb.main;

import entvy.mariadb.Book;
import entvy.mariadb.CRUD;
import entvy.mariadb.Member;
import entvy.mariadb.Rental;

public class HrdTest {

	public static void main(String[] args) {
		try {
			// JDBC 드라이브 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			CRUD crud = new CRUD();
			
			Member member = new Member(4, "김김김", "010-5555-5555", "kim@naver.com");
			
			Rental rental = new Rental(105, 4, 3, "2019", "2020");
			
			Book book = new Book(7, "도서7", "저자7", "출판사7", 4000, "2025");
			
//			crud.dropTable("member");
//			crud.createTable("rental");
//			crud.insertData("book", book);
			crud.selectTable("member");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}

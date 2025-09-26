package entvy.mariadb.main;

import java.time.LocalDate;
import java.util.Scanner;

import entvy.lee.CRUD;
import entvy.lee.User;

public class MainDB {
	public static void main(String[] args) {
		
		try {
			// JDBC 드라이브 로드
			Class.forName("org.mariadb.jdbc.Driver");
			
			CRUD crud = new CRUD();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("이름을 입력하세요.");
			String name = scanner.nextLine();
			System.out.println("이메일을 입력하세요.");
			String email = scanner.nextLine();
			User user = new User(name, email, LocalDate.now());
			
			scanner.close();
			
//			crud.dropTable();
//			crud.createTable();
			crud.insertUser(user);
			crud.selectUsers();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

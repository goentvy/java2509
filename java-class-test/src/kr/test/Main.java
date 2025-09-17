package kr.test;

public class Main {
	public static void main(String[] args) {
		Student Lee = new Student("이주환", 34, "Lee");
		Student Park = new Student("박근철", 34, "Park");
		
		Lee.introduce();
		Park.introduce();
		Lee.study();
	}
}

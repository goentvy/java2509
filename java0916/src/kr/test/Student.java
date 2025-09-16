package kr.test;

public class Student extends Person {
	// Student 필드
	String studentId;
	
	// Student 생성자 Person 상속
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	// 메소드
	@Override
	public void introduce() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 학번: " + studentId);
	}
}

package kr.test;

public class Student extends Person{
	String studentId;
	
	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}
	
	@Override
	public void introduce() {
		System.out.println("Name: " + name + " age: " + age + " studentId: " + studentId);
	}
}

package kr.co.cls;

public class Student {
	private String name;
	int age;
	private String studentId;
	
	Student() {}
	
	public String getStudent() {
		return (this.name + " " + this.age + " " + this.studentId);
	}
	
	public void setStudent(String name, int age, String studentId) {
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	void introduce() {
		System.out.println(this.name + " 학생을 소개합니다.");
	}
	
	void study() {
		System.out.println(this.studentId + "번이 공부중입니다.");
	}
}

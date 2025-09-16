package kr.test;

// 추상클래스
public abstract class Person {
	// 필드
	String name;
	int age;
	
	// 생성자 매개변수 2개
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 추상 메소드
	public abstract void introduce();
}

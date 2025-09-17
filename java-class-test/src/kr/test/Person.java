package kr.test;

public abstract class Person implements Study {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public abstract void introduce();
	public void study() {
		System.out.println(name + " 학생이 공부중입니다.");
	}
}

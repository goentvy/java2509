package kr.co.ext;

public class Animal {
	private String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println("소리를 냅니다.");
	}
}

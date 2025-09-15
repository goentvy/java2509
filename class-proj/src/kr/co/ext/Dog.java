package kr.co.ext;

public class Dog extends Animal {
	String breeds;
	
	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("멍멍");
	}
	
	public void wegTail() {
		System.out.println("개가 꼬리를 살랑");
	}
}

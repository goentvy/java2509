package kr.co.inherit;

public class Dog extends Animal {
	String breeds;

	public Dog(String name, int age, String breeds) {
		super(name, age);
		this.breeds = breeds;
	}

	public void wagTail() {
		System.out.println(this.name + " 꼬리를 흔듭니다.");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(this.name + "입니다.");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + "가 고기를 먹어요");
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println(this.name + "가 멍멍 짓습니다.");
	}
}

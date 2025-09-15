package kr.co.ext;

public class Cat extends Animal {
	boolean inDoor;
	
	public Cat(String name, int age, boolean inDoor) {
		super(name, age);
		this.inDoor = inDoor;
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("야옹");
	}
	
	public void climb() {
		System.out.println("고양이가 위로 올라갑니다.");
	}
}

package kr.co.inherit;

public class Cat extends Animal {
	boolean isIndoor;

	public Cat(String name, int age, boolean isIndoor) {
		super(name, age);
		this.isIndoor = isIndoor;
	}

	public void climb() {
		System.out.println(this.name + " 점프해 올라탑니다.");
	}
	
	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println(isIndoor ? "실내묘입니다." : "실내묘가 아닙니다.");
	}
	
	@Override
	public void eat() {
		super.eat();
		System.out.println(this.name + "가 츄르를 먹습니다.");
	}
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println(this.name + "가 야옹하고 웁니다.");
	}
}

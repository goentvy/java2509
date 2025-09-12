package kr.co.inherit;

public class InheritClass {
	public InheritClass() {
		
//		생성자
		
		Dog dog = new Dog("강아지", 3, "골든리트리버");
		Cat cat = new Cat("고양이", 2, true);
		
		System.out.println("----- Dog -----");
		dog.displayInfo();
		dog.eat();
		dog.makeSound();
		dog.wagTail();
		
		System.out.println("----- Cat -----");
		cat.displayInfo();
		cat.eat();
		cat.makeSound();
		cat.climb();
	}
}

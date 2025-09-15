package kr.co.ext;

public class ExtClass {
	
	public ExtClass() {
		Dog dog = new Dog("강아지", 3, "골든리트리버");
		Cat cat = new Cat("고양이", 2, true);
		
		System.out.println(dog.breeds);
		System.out.println(cat.inDoor);
		
		dog.makeSound();
		cat.makeSound();
	}
}

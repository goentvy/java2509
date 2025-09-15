package kr.co.poly;

import kr.co.ext.Animal;
import kr.co.ext.Cat;
import kr.co.ext.Dog;

public class PolyClass {
	public PolyClass() {
		
		// 다형성 배열 - 업캐스팅
		Animal[] ani = {
							new Dog("바둑이", 5, "진돗개"),
							new Cat("나비", 3, false),
							new Dog("체리", 2, "푸들"),
							new Cat("까망이", 4, true)
						};
		System.out.println("----- 다형성 배열로 구성된 객체의 값 접근하기 -----");
		for (Animal animal : ani) {
			// 다형성 - 각각의 오버라이드된 메서드 호출
			System.out.println("name : " + animal.getName());
			animal.makeSound();
		}
		
		System.out.println("----- 자식 객체의 특성 값 접근하기 -----");
		for (Animal animal : ani) {
			if(animal instanceof Dog myDog) {
				// 임시변수 myDog 타입 강제변환 - 다운캐스팅
//				Dog myDog = (Dog) animal;
				myDog.wegTail();
			} else if(animal instanceof Cat myCat) {
//				Cat myCat = (Cat) animal;
				myCat.climb();
			}
		}
	}
}

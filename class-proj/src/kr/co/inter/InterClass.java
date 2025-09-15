package kr.co.inter;

import kr.co.ext.Bird;
import kr.co.ext.Duck;

public class InterClass {
	public InterClass() {
		Bird bird = new Bird("참새", 1, 25.5);
		Duck duck = new Duck("도널드", 3);
		
		bird.makeSound();
		bird.walk();
		bird.fly();
		System.out.println("-----");
		duck.makeSound();
		duck.walk();
		duck.swim();
		System.out.println("=====");
		
//		인터페이스를 타입으로 사용
		Walkable[] walkAni = {bird, duck};
		for (Walkable walkable : walkAni) {
			walkable.walk();
		}
		
//		다형성 인터페이스
		testSwim(duck);
		testFly(bird);
	}
	
	private void testFly(Flyable flying) {
		flying.fly();
	}

	private void testSwim(Swimmable swimmer) {
		swimmer.swim();
	}

	public static void testWalk(Walkable walker) {
		walker.walk();
	}
}

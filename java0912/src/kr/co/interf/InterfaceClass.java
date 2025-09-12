package kr.co.interf;

public class InterfaceClass {
	public InterfaceClass() {
		Bird bird = new Bird("참새", 1, 25.5);
		Duck duck = new Duck("도널드", 3);
		
		bird.Fly();
		bird.Walk();
		
		duck.Fly();
		duck.Walk();
		duck.Swim();
	}
}

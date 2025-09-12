package kr.co.interf;

import kr.co.inherit.Animal;

public class Bird extends Animal implements Flyable, Walkable {

	public Bird(String name, int age, double speed) {
		super();
	}
	
	@Override
	public void Fly() {
		System.out.println("새 날다!");
	}
	@Override
	public void Walk() {
		System.out.println("새 걷다!");
	}
}

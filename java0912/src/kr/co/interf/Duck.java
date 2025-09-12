package kr.co.interf;

import kr.co.inherit.Animal;

public class Duck extends Animal implements Flyable, Walkable, Swimmable {

	public Duck(String name, int age) {
		super();
	}
	
	@Override
	public void Fly() {
		System.out.println("오리 날다!");
	}
	@Override
	public void Walk() {
		System.out.println("오리 걷다!");
	}
	@Override
	public void Swim() {
		System.out.println("오리 헤엄치다!");
	}

}

package kr.co.ext;

import kr.co.inter.Flyable;
import kr.co.inter.Walkable;

public class Bird extends Animal implements Flyable, Walkable {
	double wingspan;
	public Bird(String name, int age, double wingspan) {
		super(name, age);
		this.wingspan = wingspan;
	}

	@Override
	public void walk() {
		System.out.println("총총총 걸어요");
	}
	
	@Override
	public void fly() {
		System.out.println("훨훨 날아요");
	}
}

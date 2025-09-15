package kr.co.ext;

import kr.co.inter.Swimmable;
import kr.co.inter.Walkable;

public class Duck extends Animal implements Swimmable, Walkable {
	public Duck(String name, int age) {
		super(name, age);
	}

	@Override
	public void walk() {
		System.out.println("뒤뚱 걸어요");
	}
	
	@Override
	public void swim() {
		System.out.println("풍덩 수영해요");
	}
}

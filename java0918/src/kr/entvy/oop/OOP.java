package kr.entvy.oop;

class Animal {
	void sound() {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("멍멍!");
	}
}

public class OOP {
	public static void main(String[] args) {
		Animal a = new Dog(); // 다형성
		a.sound();
	}
}

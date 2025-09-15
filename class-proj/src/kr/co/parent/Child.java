package kr.co.parent;

public class Child extends Parent {
//	public String field2;
//	
//	public void method3() {
//		System.out.println("Child-method3()");
//	}
//	
//	public void showField1() {
//		System.out.println("Child: " + this.field1);
//	}
//	
//	public void showField2() {
//		System.out.println("Child: " + this.field2);
//	}
	
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}

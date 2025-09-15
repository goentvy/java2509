package kr.co.parent;

public class Parent {
//	public String field1;
//	
//	public void method1() {
//		System.out.println("Parent-method1()");
//	}
//	
//	public void method2() {
//		System.out.println("Parent-method2()");
//	}
//	
//	public void showField1() {
//		System.out.println("Parent: " + this.field1);
//	}
	
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}

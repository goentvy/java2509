package java0910;

public class Child extends Inheritance {
	int field2;
	void method2(int v) {
		this.field2 = v;
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("Child field2 : " + child.field2);
		child.method2(5);
		System.out.println("Child field2 : " + child.field2);
		System.out.println("Inheritance field1 : " + child.field1);
		child.method1(10);
		System.out.println("Inheritance field1 : " + child.field1);
	}
}

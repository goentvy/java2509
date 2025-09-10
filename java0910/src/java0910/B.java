package java0910;

public class B {
	public void method() {
		A a = new A();
		
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;	//error
		
		a.method1();
		a.method2();
//		a.method3();	//error
	}
}

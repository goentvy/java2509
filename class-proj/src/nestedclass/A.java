package nestedclass;

public class A {
//	인스턴스 멤버 클래스
//	class B {
//		int field1 = 1;
//		
//		static int field2 = 2;
//		
//		B() {
//			System.out.println("B-생성자 실행");
//		}
//		
//		void method1() {
//			System.out.println("B-method1 실행");
//		}
//		
//		static void method2() {
//			System.out.println("B-method2 실행");
//		}
//	}
//	
//	void useB() {
//		B b = new B();
//		System.out.println(b.field1);
//		b.method1();
//		
//		System.out.println(B.field2);
//		B.method2();
//	}
	
//	정적 멤버 클래스
//	static class B {
//		int field1 = 1;
//		
//		static int field2 = 2;
//		
//		B() {
//			System.out.println("B-생성자 실행");
//		}
//		
//		void method1() {
//			System.out.println("B-method1 실행");
//		}
//		
//		static void method2() {
//			System.out.println("B-method2 실행");
//		}
//	}
	
//	로컬 클래스
	// ㅡ 바깥 클래스의 객체 접근 ㅡ
	// A 인스턴스 필드
	String field = "A-field";
	
	// A 인스턴스 메소드
	void method() {
		System.out.println("A-method");
	}
	
	class B {
		// B 인스턴스 필드
		String field = "B-field";
		
		// B 인스턴스 메소드
		void method() {
			System.out.println("B-method");
		}
		
		// B 인스턴스 메소드
		void print() {
			// B 객체의 필드와 메소드 사용
			System.out.println(this.field);
			this.method();
			
			// A 객체의 필드와 메소드 사용
			System.out.println(A.this.field);
			A.this.method();
		}
	}
	
	// A의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
}

package kr.co.cls;

public class BasicClass {
	public BasicClass() {
//		new 키워드 : 객체obj 생성
		/*
		 * Student st1 = new Student(); Student st2 = new Student();
		 * 
		 * // 필드에 접근하여 값 할당 st1.name = "이주환"; st1.age = 34; st1.studentId = "19920601";
		 * st2.name = "박근철"; st2.age = 34; st2.studentId = "19921010";
		 */
		
//		객체 생성과 초기화init
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.setStudent("이주환", 34, "19920601");
		st2.setStudent("박근철", 34, "19921010");
		
		String student = st1.getStudent();
		
		System.out.println("student : " + student);
		
		
//		함수(클래스 안에 있는) 메서드 호출
		st1.introduce();
		st1.study();
		st2.introduce();
		st2.study();
	}
}

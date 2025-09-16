package kr.test;

public class Main {

	public static void main(String[] args) {
		// 오브젝트 생성
		Student lee = new Student("이주환", 34, "920601");
		Student park = new Student("박근철", 34, "921010");
		
		// 메소드 실행
		lee.introduce();
		park.introduce();
		
		// 인터페이스 print 
		Document doc = new Document("정리 끝");
		doc.print();
	}
}
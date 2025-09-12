package kr.co.abstrac;

public abstract class Shape {
	
//	Shape클래스 안에는, 구현부가 없는 메소드가 존재하고 있다.
	
	abstract String getShapeType();
	
	public void description() {
		System.out.println("이것은 도형입니다.");
	}
	
//	추상 메서드: 넓이는 도형마다 다르므로 자식 클래스에서 구현
	public abstract double area();
}

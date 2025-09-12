package kr.co.abstrac;

// 추상클래스 
public class AbstractClass {
	public AbstractClass() {
		// 도형만들기: color, 위치(x, y), 원(radius), 사각형(w, h)
		Circle circle = new Circle("red", 10.0, 10.0, 5.0);
		Rectangle rectangle = new Rectangle("blue", 30.0, 10.0, 8.0, 5.0);
		
		System.out.println(circle.getShapeType());
		System.out.println(rectangle.getShapeType());
		
		Shape circle1 = new Circle(5);
		Shape square = new Rectangle(4);
		
		circle1.description();
		System.out.println("원의 넓이: " + circle1.area());
		
		square.description();
		System.out.println("정사각형의 넓이: " + square.area());
	}
}

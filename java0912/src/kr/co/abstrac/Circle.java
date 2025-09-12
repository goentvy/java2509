package kr.co.abstrac;

public class Circle extends Shape {

	public Circle(String color, double x, double y, double r) {
		// TODO Auto-generated constructor stub
	}

	@Override
	String getShapeType() {
		return "my type is circle";
	}
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

}
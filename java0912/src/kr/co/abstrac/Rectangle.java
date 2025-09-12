package kr.co.abstrac;

public class Rectangle extends Shape {

	public Rectangle(String color, double x, double y, double w, double h) {
		// TODO Auto-generated constructor stub
	}

	@Override
	String getShapeType() {
		return "my type is rectangle";
	}
	
	private double side;
	
	public Rectangle(double side) {
		this.side = side;
	}
	
	@Override
	public double area() {
		return side * side;
	}

}

package java0910;

public class Calculator {
	String color;
	static double pi = 3.14159;
	
	void setColor(String color) { this.color = color; }
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static double divide(int x, int y) {
		return (double) x / (double) y;
	}
	
	static double areaRectangle(double width) {
		return width * width;
	}
	
	static double areaRectangle(double width, double height) {
		return width * height;
	}
}

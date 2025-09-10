package java0910;

public class Printer {
	public static void println(int value) {
		System.out.println(value);
	}
	public static void println(boolean value) {
		System.out.println(value);
	}
	public static void println(double value) {
		System.out.println(value);
	}
	public static void println(String value) {
		System.out.println(value);
	}
	
	public static void main(String[] args) {
//		Printer print = new Printer();
//		print.println(3);
//		print.println(true);
//		print.println(3.3);
//		print.println("이주환");
		
		Printer.println(3);
		Printer.println(true);
		Printer.println(3.3);
		Printer.println("이주환");
	}
}

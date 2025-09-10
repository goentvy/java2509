package java0910;

public class Television {
	static String company = "MyCompany";
	static String model = "LCD";
	static String info;
	static void show() { System.out.println("void show" + company + "-" + model); }
	
	static {
		info = company + "-" + model;
		show();
	}
}

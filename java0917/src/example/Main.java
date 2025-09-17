package example;

public class Main {

	public static void main(String[] args) {
		Object object1 = new Object();
		Object object2 = object1;
		
		boolean result = object1.equals(object2);
		System.out.println(result);
		boolean result2 = object1 == object2;
		System.out.println(result2);
	}

}

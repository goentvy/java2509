package kr.entvy.generic;

//class Box<T> {
//	T value;
//	
//	void set(T value) {
//		this.value = value;
//	}
//	
//	T get() {
//		return value;
//	}
//}

//class Stats<T extends Number> {
//	T[] nums;
//	
//	// Constructor
//	Stats(T[] nums) {
//		this.nums = nums;
//	}
//	
//	// Calculate average
//	Double average() {
//		double sum = 0;
//		for (T num : nums) {
//			sum += num.doubleValue();
//		}
//		return sum / nums.length;
//	}
//}

public class GenericClass {
	
	public static <T> void printArray(T[] array) {
		for(T item : array) {
			System.out.println(item);
		}
	}
	public static void main(String[] args) {
		// String Type Generic Box Class Add
		Box<String> stringBox = new Box<>();
		stringBox.set("hello");
		System.out.println("Value: " + stringBox.get());
		
		// Create a Box to hold an Integer
		Box<Integer> intBox = new Box<>();
		intBox.set(50);
		System.out.println("Value: " +intBox.get());
		
		// Array of Strings printArray Generic method
		String[] names = {"jenny", "Liam"};
		
		// Array of Integers
		Integer[] numbers = {1, 2, 3};
		
		// Call the generic method with both arrays
		printArray(names);
		printArray(numbers);
		
		// Use with Integer
		Integer[] intNums = {10, 20, 30, 40, 50, 60, 70, 80};
		Stats<Integer> intStats = new Stats<>(intNums);
		System.out.println("Integer average: " + intStats.average());
		
		// Use with Double
		Double[] doubleNums = {1.5, 2.5, 3.5};
		Stats<Double> doubleStats = new Stats<>(doubleNums);
		System.out.println("Double average: " + doubleStats.average());
	}
}
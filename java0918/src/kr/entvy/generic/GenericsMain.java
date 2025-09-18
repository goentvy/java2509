package kr.entvy.generic;

class Box<T> {
	T value;
	
	void set(T value) {
		this.value = value;
	}
	
	T get() {
		return value;
	}
}

class Stats<T extends Number> {
	T[] nums;
	
	Stats(T[] nums) {
		this.nums = nums;
	}
	
	double average() {
		double sum = 0;
		for (T num : nums) {
			sum += num.doubleValue();
		}
		return sum / nums.length;
	}
}

public class GenericsMain {
	private <T> void printArray(T[] array) {
		for (T item : array) {
			System.out.println(item);
		}
	}
	public GenericsMain() {
		
		Box<String> strBox = new Box<>();
		strBox.set("Hello");
		System.out.println("값은: " + strBox.get());
		
		Box<Integer> intBox = new Box<>();
		intBox.set(50);
		System.out.println("값은: " + intBox.get());
		
		System.out.println("--------------");
		
//		배열<String> 사용하기
		String[] names = {"근철", "주환"};
		printArray(names);
		
//		배열<Integer> 사용하기
		Integer[] numbers = {10, 20, 30};
		printArray(numbers);
		System.out.println("--------------");
		
		Integer[] intNums = {10, 20, 30, 40};
		Stats<Integer> intStats = new Stats<>(intNums);
		System.out.println("Integer average: " + intStats.average());
		
		Double[] doubleNums = {1.5, 2.5, 3.5};
		Stats<Double> doubleStats = new Stats<>(doubleNums);
		System.out.println("Double average: " + doubleStats.average());
	}
}

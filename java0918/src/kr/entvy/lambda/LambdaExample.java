package kr.entvy.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

import kr.entvy.interfaces.Calculable;

interface StringFunction {
	String run(String str);
}

public class LambdaExample {

	public static void main(String[] args) {
//		action((x, y) -> {
//			int result = x + y;
//			System.out.println("result: " + result);
//		});
//		
//		action((x, y) -> {
//			int result = x - y;
//			System.out.println("result: " + result);
//		});
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		numbers.add(5);
//		numbers.add(9);
//		numbers.add(8);
//		numbers.add(1);
////		numbers.forEach((n) -> { System.out.println(n); });
//		Consumer<Integer> method = (n) -> { System.out.println(n); };
//		numbers.forEach(method);
		
		/* 
		 * StringFunction exclaim = new StringFunction() {
		 * 	@Override
		 * 	public String run(String s) {
		 * 		return s + "!";
		 * 	}
		 * } */
		
		// 익명클래스 -> 람다 표현식
		StringFunction exclaim = (s) -> s + "!";
		StringFunction ask = (s) -> s + "?";
		printFormatted("Hello", exclaim);
		printFormatted("Hello", ask);
	}
	
	public static void printFormatted(String str, StringFunction format) {
		String result = format.run(str);
		System.out.println(result);
	}
	
	public static void action(Calculable calculable) {
		int x = 10;
		int y = 4;
		// 데이터 처리
		calculable.calculate(x, y);
	}
}

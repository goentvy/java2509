package kr.entvy.wrapper;

import java.util.ArrayList;

public class WrapperMain {
	public WrapperMain() {
		
//		Primitive Data Type >> Wrapper Class
		/* 
		 * byte		>> Byte
		 * short 	>> Short
		 * int 		>> Integer
		 * long		>> Long
		 * float	>> Float
		 * double	>> Double
		 * boolean	>> Boolean
		 * char		>> Character
		 *
		 */
		
//		제네릭 <래퍼클래스 타입>
//		ArrayList<int> myNums = new ArrayList<>();
		ArrayList<Integer> myNums = new ArrayList<>();
		
		Integer myInt = 100;
		Double myDouble = 5.55;
		Character myChar = 'A';
		String myString = myInt.toString();
		System.out.println(myInt + " - " + myDouble + " - " + myChar);
		System.out.println(myInt.intValue());
		System.out.println(myDouble.doubleValue());
		System.out.println(myChar.charValue());
		System.out.println(myString.length());
	}
}

package java0910;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		int result = myCalc.plus(10, 20);
		System.out.println("더하기" + result);
		double result1 = myCalc.divide(30, 5);
		System.out.println("나누기" + result1);
		myCalc.powerOff();
		
		Calculator myCalcu = new Calculator();
		
		double result2 = myCalcu.areaRectangle(10);
		double result3 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("가로 넓이 : " + result2);
		System.out.println("가로세로 전체 넓이 : " + result3);
		
		double result4 = 10 * 10 * Calculator.pi;
		
		System.out.println(result4);
	}
}

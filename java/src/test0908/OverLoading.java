package test0908;

import ch01.sec11.Calculator;

public class OverLoading {
    // 매개변수가 없는 add 메서드
    public void add() {
        System.out.println("매개변수가 없습니다.");
    }

    // 정수형 매개변수 하나를 받는 add 메서드
    public int add(int a) {
        System.out.println("정수형 매개변수 하나: " + a);
        return a;
    }

    // 정수형 매개변수 두 개를 받는 add 메서드
    public int add(int a, int b) {
        System.out.println("정수형 매개변수 두 개: " + a + ", " + b);
        return a + b;
    }

    // 더블형 매개변수 두 개를 받는 add 메서드 (타입이 다름)
    public double add(double a, double b) {
        System.out.println("더블형 매개변수 두 개: " + a + ", " + b);
        return a + b;
    }

    // String 타입 매개변수를 받는 print 메서드 (메서드 이름 재활용)
    public void print(String message) {
        System.out.println("메시지: " + message);
    }

    // int 타입 매개변수를 받는 print 메서드
    public void print(int number) {
        System.out.println("숫자: " + number);
    }

    public static void main(String[] args) {
        OverLoading cal = new OverLoading();

        cal.add(); // 매개변수 없는 add() 호출
        cal.add(10); // 정수형 매개변수 하나를 받는 add(int a) 호출
        cal.add(10, 20); // 정수형 매개변수 두 개를 받는 add(int a, int b) 호출
        cal.add(10.5, 20.3); // 더블형 매개변수 두 개를 받는 add(double a, double b) 호출

        cal.print("Hello Overloading"); // String 매개변수를 받는 print() 호출
        cal.print(123); // int 매개변수를 받는 print() 호출
        
        // return 값이 있는 메서드 사용
        int result;
        double result1;
        System.out.println(result = cal.add(10));
        System.out.println(result = cal.add(10, 20));
        System.out.println(result1 = cal.add(10.5, 20.3));

    }
}

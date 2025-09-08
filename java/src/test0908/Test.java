package test0908;

public class Test {
    public static void main(String[] args) {
        // 이주환

        String name = "철수";
        int age = 18;
        double height = 182;
        boolean student = true;
        char grade = 'B';

        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
        System.out.println("키: " + height);
        System.out.println("학생여부: " + student);
        System.out.println("성적: " + grade);

        int a = 10;
        int b = 3;
        int result;

        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("1. 연산자");
        System.out.println("산술연산자");
        result = a + b;
        System.out.println("a + b : " + result);
        result = a - b;
        System.out.println("a - b : " + result);
        result = a * b;
        System.out.println("a * b : " + result);
        result = a / b;
        System.out.println("a / b : " + result);
        result = a % b;
        System.out.println("a % b : " + result);

        System.out.println("비교연산자");
        System.out.println("a < b : " + (a<b));
        System.out.println("a == b : " + (a==b));

        System.out.println("논리연산자");
        boolean result1 = (a==10) && (b==3);
        System.out.println("a && b : " + result1);
        boolean result2 = (a==10) || (b==3);
        System.out.println("a || b : " + result2);
        boolean result3 = !(a==10);
        System.out.println("!a : " + result3);

        System.out.println("증감연산자");
        result = a++;
        System.out.println("a++ : " + result);
        result = ++a;
        System.out.println("++a : " + result);
        result = a--;
        System.out.println("a-- : " + result);
        result = --a;
        System.out.println("--a : " + result);

        System.out.println("2. if문, switch문과 break");
        int score = 85;

        System.out.println("if문");
        if(score >= 90) {
            System.out.println("90점 이상 합격");
        } else {
            System.out.println("90점 미만 불합격");
        }

        System.out.println("삼항연산자");
        System.out.println(score >= 90 ? "90점 이상 합격" : "90점 미만 불합격");

        System.out.println("Switch문");
        switch (score/10) {
            case 10:
            case 9:
                System.out.println("90점 이상 합격");
                break;
            default:
                System.out.println("90점 미만 불합격");
                break;
        }

        System.out.println("for문");

        for(int dan = 2; dan < 10; dan++) {
            for(int val = 1; val < 10; val++) {
                System.out.println(dan + "*" + val + "=" + dan * val);
            }
        }
    }
}

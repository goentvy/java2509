package test0908;

public class Variable {
    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = 'a';
        char c3 = 'b';

        if (c1 == c2) {
            System.out.println("c1과 c2는 같습니다. (c1 == c2)");
        }

        if (c1 == c3) {
            System.out.println("c1과 c3는 같습니다. (c1 == c3)");
        } else {
            System.out.println("c1과 c3는 다릅니다. (c1 !== c3)");
        }

        // Character 클래스의 compare() 메서드를 사용한 비교
        // compare(char x, char y)는 x가 y보다 작으면 음수, 같으면 0, 크면 양수를 반환
        int comparisionResult = Character.compare(c1, c3);
        if (comparisionResult == 0) {
            System.out.println("c1과 c3는 Character.compare()로 비교 시 같습니다.");
        } else if(comparisionResult < 0) {
            System.out.println("c1이 c3보다 작습니다. (Character.compare(c1, c3))");
        } else {
            System.out.println("c1이 c3보다 큽니다. (Character.compare(c1, c3))");
        }

        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        String s4 = "world";

        // 1. == 연산자를 사용한 비교 ( 참조값 비교 )
        System.out.println("s1 == s2: " + (s1 == s2)); // true (String Constant Pool에서 동일한 리터럴을 참조)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (s1은 상수 풀, s3는 힙 메모리에 별도의 객체)
        System.out.println("s1 == s4: " + (s1 == s4)); // false

        // 2. equals() 메서드를 사용한 비교 ( 문자열 값 비교 )
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true
        System.out.println("s1.equals(s3): " + s1.equals(s3)); // true
        System.out.println("s1.equals(s4): " + s1.equals(s4)); // false

        // 3. equalsIgnoreCase() 메서드를 사용한 비교 (대소문자 구분 없이 문자열 값 비교)
        String s5 = "Hello";
        System.out.println("s1.equals(s5): " + s1.equals(s5)); //false (대소문자 구분)
        System.out.println("s1.equalsIgnoreCase(s5): " + s1.equalsIgnoreCase(s5)); // true (대소문자 무시)

    }
}

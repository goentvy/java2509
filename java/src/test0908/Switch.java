package test0908;

public class Switch {
    public static void main(String[] args) {
        char grade = 'c';

        String grades = switch (grade) {
            case 'A', 'a' -> "우수 회원입니다.";
            case 'B', 'b' -> {
                String result = "일반 회원입니다.";
                yield result;
            }
            default -> "손님입니다.";
        };

        System.out.println("결과값: " + grades);
    }
}

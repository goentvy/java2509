package test0908;

public class Split {
    public static void main(String[] args) {
        String board = "1 자바학습 참조타입 String을 학습합니다. 홍길동";

        String[] tokens = board.split(" ");

        for(String token : tokens) {
            System.out.println(token);
        }
    }
}

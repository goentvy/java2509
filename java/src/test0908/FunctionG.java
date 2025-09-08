package test0908;

public class FunctionG {
    static void gugudan(int dan, int val, int breakPoint) {
        Gugu : for(int i = dan; i <= val; i++) {
            if(i == breakPoint) {
                break Gugu;
            }
            System.out.println(dan + "단부터 시작 " + i + "단");
            for(int j = 1; j <= val; j++) {
                System.out.println(i + "*" + j + "=" + i*j);
            }
        }
        System.out.println("구구단 종료");
    }

    public static void main(String[] args) {
        gugudan(2, 9, 5);
    }
}

package test0908;

public class ArrayCreateByValueList {
    static void ShowNames(String[] Arr) {
        for(String name : Arr) {
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        String[] names = null;
        names = new String[] {"이주환", "박근철", "송동현", "최준호"};

        for(int i=0; i<names.length; i++) {
            System.out.println("for문 : " + names[i]);
        }

        ShowNames(names);

        ShowNames(new String[] {"현명한", "인간은", "무엇을", "할까"});

        // printItem() 사용
        printItem(new int[] { 83, 90, 87 });

        String[][] students = new String[][] {{"이주환", "박근철"},{"송동현","최준호"}};
        for(String[] student : students) {
            System.out.println("배열" + student.length);
            for(String stdt : student) {
                System.out.println(stdt);
            }
        }
    }

    public static void printItem(int[] scores) {
        for(int i=0; i<3; i++) {
            System.out.println("score[" + i + "]: " + scores[i]);
        }
    }
}

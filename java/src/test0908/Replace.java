package test0908;

public class Replace {
    public static void main(String[] args) {
        String oldStr = "자바 프로그래밍";
        String newStr = oldStr.replace("자바", "Java");
//        System.out.println(newStr);

        int index = oldStr.indexOf("프로그래밍");
        if(index == -1) {
            //포함되어 있지 않은 경우
            System.out.println("미포함 : " + oldStr);
        } else {
            //포함되어 있는 경우
            String oldStrSubstring = oldStr.substring(index);
            System.out.println("찾으려 했던 내용: " + oldStrSubstring);
        }
        boolean oldStrContains = oldStr.contains("프로그래밍");
        if(oldStrContains) {
            System.out.println("프로그래밍 포함");
        } else {
            System.out.println("프로그래밍 미포함");
        }
    }
}

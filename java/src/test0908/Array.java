package test0908;

public class Array {
    static void stringForEach(String[] arr) {
        for(String ar : arr) {
            System.out.println("string forEach function : " + ar);
        }
    }
    static void intForEach(int[] arr) {
        for(int ar : arr) {
            System.out.println("integer forEach function : " + ar);
        }
    }
    public static void main(String[] args) {
        // 배열선언 - 1
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // 배열선언 - 2
        String[] vars = new String[4]; // size is 4

        vars[0] = "Volvo";
        vars[1] = "BMW";
        vars[2] = "Ford";
        vars[3] = "Mazda";
//        vars[4] = "Mazda..."; // ArrayIndexOutOfBoundsException Error ( Index 4 out of bounds for length 4 )

        // 배열선언 - 3
        String[] bars = new String[] {"Volvo", "BMW", "Ford", "Mazda"};

//        for (int i=0; i<bars.length; i++) {
//            System.out.println(bars[i]);
//        }

//        for (String car : cars) {
//            System.out.println("for each: " + car);
//        }

        stringForEach(cars);

        // for each 실제사례 나이 평균값
        int[] ages = {20, 22, 18, 35, 48, 26, 87, 70};

        intForEach(ages);

        float avg, sum = 0;

        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("나이 평균: " + avg);

        // for each 가장 낮은 연령 찾기
        int lowestAge = ages[0];

        for(int age: ages) {
            if(lowestAge > age) {
                lowestAge = age;
            }
        }
        System.out.println("가장 낮은 나이: " + lowestAge);

        // 다차원배열

        int[][] myNumbers = {
                {1, 4, 2},
                {3, 6, 8, 5, 2}
        };

        // 일반 for 문
        for(int row = 0; row < myNumbers.length; row++) {
            for(int col = 0; col < myNumbers[row].length; col++) {
                System.out.println("myNumbers[" + row + "][" + col + "] = " + myNumbers[row][col]);
            }
        }

        // for each
        for (int[] row : myNumbers) {
            for (int num : row) {
                System.out.println(num);
            }
        }
    }
}

package hw2;

import java.util.ArrayList;

public class Fibonachi {

    public static String сalculate(int loopType, int n) {
        ArrayList<Integer> fibanachi = new ArrayList<>(n);

        int count = 0;
        int count1 = 0;
        int count2 = 1;
        int count3;
        if (loopType == 1) {
            while (count < n) {
                fibanachi.add(count1);
                count3 = count1 + count2;
                count2 = count1;
                count1 = count3;
                count++;
            }

        }
        if (loopType == 2) {
            do {
                fibanachi.add(count1);
                count3 = count1 + count2;
                count2 = count1;
                count1 = count3;
                count++;
            }
            while (count < n);

        }
        if (loopType == 3) {
            for (int i = 0; i < n; i++) {
                fibanachi.add(count1);
                count3 = count1 + count2;
                count2 = count1;
                count1 = count3;
                count++;
            }
        }
        else if (loopType > 3 || loopType == 0){
            System.out.println("Хули ты вводишь, не видишь, что у нас мощности компухтера ограничены?");
        }
        return "Ебаначи " + n + " = " + fibanachi;
    }
}

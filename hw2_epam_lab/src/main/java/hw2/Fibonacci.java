package hw2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Integer> сalculate(int loopType, int n) {

        List<Integer> fibanachi = new ArrayList<>(n);
        int count = 0;
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue;

        switch (loopType) {
            case 1 -> {
                while (count < n) {
                    fibanachi.add(firstValue);
                    thirdValue = firstValue + secondValue;
                    secondValue = firstValue;
                    firstValue = thirdValue;
                    count++;
                }
            }
            case 2 -> {
                do {
                    fibanachi.add(firstValue);
                    thirdValue = firstValue + secondValue;
                    secondValue = firstValue;
                    firstValue = thirdValue;
                    count++;
                }
                while (count < n);
            }

            case 3 -> {
                for (int i = 0; i < n; i++) {
                    fibanachi.add(firstValue);
                    thirdValue = firstValue + secondValue;
                    secondValue = firstValue;
                    firstValue = thirdValue;
                    count++;
                }
            }

            default -> throw new IllegalStateException("Error loopType: " + loopType);
        }
        return fibanachi;
    }
}

package hw2;

public class Factorial {

    public static int calculate(int loopType, int n) {
        int factorial = 0;
        int count = 0;
        switch (loopType) {
            case 1 -> {
                while (count < n) {
                    factorial = n * n;
                    count++;
                }
            }
            case 2 -> {
                do {
                    factorial = n * n;
                    count++;
                }
                while (count < n);
            }
            case 3 -> {
                for (int i = 0; i < n; i++) {
                    factorial = n * n;
                    i++;
                }

            }
            default -> throw new IllegalStateException("Error loopType:" + loopType);
        }
        return factorial;
    }
}

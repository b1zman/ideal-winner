package hw2;

public class Fucktorial {

    public static String calculate(int loopType, int n) {
        int fucktorial = 0;
        int count = 0;
        if (loopType == 1) {
            while (count < n) {
                fucktorial = n * n;
                count++;
            }

        }
        if (loopType == 2) {
            do {
                fucktorial = n * n;
                count++;
            }
            while (count < n);
        }
        if (loopType == 3) {
            for (int i = 0; i < n; i++) {
                fucktorial = n * n;
                i++;
            }
        } else if (loopType > 3 || loopType == 0) {
            System.out.println("Хули ты вводишь, не видишь, что у нас мощности компухтера ограничены?");
        }
        return "ФАКториал "+ n + " = "+ fucktorial;
    }
}

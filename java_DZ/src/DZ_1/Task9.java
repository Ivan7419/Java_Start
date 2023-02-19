package DZ_1;

import java.util.Random;

public class Task9 implements Runnable{

    @Override
    public void run() {
        int[] numbers = fillArray(new int[10]);
        int positive = 0, negative = 0, nulls = 0;

        for (int i =0; i < 10; i++) {
            if (numbers[i] > 0) positive++;
            else if (numbers[i] < 0) negative++;
            else nulls++;
            System.out.print(numbers[i]+" ");
        }

        System.out.println("\nPositive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Nulls: " + nulls);
    }

    private int[] fillArray(int[] numbers) {
        Random random = new Random();
        for (int i =0; i < 10; i++) numbers[i] = random.nextInt(-10, 10);

        return numbers;
    }
}

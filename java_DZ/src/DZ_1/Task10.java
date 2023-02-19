package DZ_1;

import java.util.Random;

public class Task10 implements Runnable{
    @Override
    public void run() {
        int[] numbers = fillArray(new int[10]);
        printArray(numbers);
        int positiveNum = 0;
        int negativeNum = 0;
        int evenNum = 0;
        int oddsNum = 0;

        for (int i = 0; i < 10; i++)
        {
            if (numbers[i] == 0) continue;

            if(numbers[i] % 2 == 0) evenNum++;
            else oddsNum++;

            if (numbers[i] > 0) positiveNum++;
            else if(numbers[i] < 0) negativeNum++;
        }

        int[] positiveNumbers = new int[positiveNum];
        int[] negativeNumbers = new int[negativeNum];
        int[] evenNumbers = new int[evenNum];
        int[] oddsNumbers = new int[oddsNum];

        int pos = 0, neg = 0 , even = 0, odd = 0;
        for (int i = 0; i < 10; i++)
        {
            if (numbers[i] == 0) continue;
            if(numbers[i] % 2 == 0) evenNumbers[even++] = numbers[i];
            else oddsNumbers[odd++] = numbers[i];

            if (numbers[i] > 0) positiveNumbers[pos++] = numbers[i];
            else if(numbers[i] < 0) negativeNumbers[neg++] = numbers[i];
        }

        System.out.print("Positive numbers: ");
        printArray(positiveNumbers);
        System.out.print("Negative numbers: ");
        printArray(negativeNumbers);
        System.out.print("Even numbers: ");
        printArray(evenNumbers);
        System.out.print("Odd numbers: ");
        printArray(oddsNumbers);
    }

    private int[] fillArray(int[] numbers) {
        Random random = new Random();
        for (int i =0; i < 10; i++) numbers[i] = random.nextInt(-10, 10);

        return numbers;
    }

    private void printArray(int[] array)
    {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }
}

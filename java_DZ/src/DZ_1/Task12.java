package DZ_1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task12 implements Runnable {
    @Override
    public void run() {
        int[] numbers = fillArray(new int[10]);
        printArray(numbers);

//        Arrays.sort(numbers);

        Scanner in = new Scanner(System.in);
        System.out.print("1.Ascending\n2.Descending\n Sort by: ");
        int menu = in.nextInt();
        if (menu != 1 && menu != 2){
            System.out.println("Incorrect input");
            return;
        }
        if (menu == 1)
        {
            bubbleSort(numbers, false);
            printArray(numbers);
        }

        else {
            bubbleSort(numbers, true);
            printArray(numbers);
        }
    }

    private int[] fillArray(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) numbers[i] = random.nextInt(-10, 10);

        return numbers;
    }

    private void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.print("\n");
    }

    public static void bubbleSort(int[] arr, boolean reverse) {
        var stepsCount = arr.length - 1;

        boolean swapped;

        do {
            swapped = false;

            for (var i = 0; i < stepsCount; i++) {
                if (reverse) {
                    if (arr[i] < arr[i + 1]) {
                        var temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;

                        swapped = true;
                    }
                } else {
                    if (arr[i] > arr[i + 1]) {
                        var temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;

                        swapped = true;
                    }
                }
            }

            stepsCount--;
        } while (swapped);
    }
}

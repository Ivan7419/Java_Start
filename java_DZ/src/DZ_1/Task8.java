package DZ_1;

import java.util.Scanner;

public class Task8 implements Runnable{
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        while (true) {
            System.out.print("Input number 1: ");
            num1 = in.nextInt();
            if (num1 > 10 || num1 < 0) {
                System.out.print("Incorrect input");
                continue;
            }
            System.out.print("Input number 2: ");
            num2 = in.nextInt();
            if (num2 > 10 || num2 < 0) {
                System.out.print("Incorrect input");
                continue;
            }
            break;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i <= num2; i++)
        {
            for (int j = 1; j <= 10; j++) System.out.println(i + " * " + j + " = " + i * j);
            System.out.println("...........................");
        }
    }
}

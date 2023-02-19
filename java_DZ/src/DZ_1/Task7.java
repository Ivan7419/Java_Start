package DZ_1;

import java.util.Scanner;

public class Task7 implements Runnable{
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int num1, num2;
        System.out.print("Input number 1: ");
        num1 = in.nextInt();
        System.out.print("Input number 2: ");
        num2 = in.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        for (int i = num1; i < num2; i++)
        {
            if (i % 2 != 0) System.out.print(i+" ");
        }
    }
}

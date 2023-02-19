package DZ_1;

import java.util.Scanner;

public class Task3 implements Runnable{

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int num1;
        int num2;
        int num3;
        while (true)
        {
            System.out.print("Input number 1: ");
            num1 = in.nextInt();
            if (num1 > 10 || num1 < 0)
            {
                System.out.println("Incorrect input");
                continue;
            }
            System.out.print("Input number 2: ");
            num2 = in.nextInt();
            if (num2 > 10 || num2 < 0)
            {
                System.out.println("Incorrect input");
                continue;
            }
            System.out.print("Input number 3: ");
            num3 = in.nextInt();
            if (num3 > 10 || num3 < 0)
            {
                System.out.println("Incorrect input");
                continue;
            }
            break;
        }
        System.out.println("Result: " + formatNumber(num1, num2, num3));
    }

    private int formatNumber(int num1, int num2, int num3)
    {
        return num1*100+num2*10+num3;
    }
}

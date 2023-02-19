package DZ_1;

import java.util.Scanner;

public class Task2 implements Runnable{

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.print("Input a percentage: ");
        int percentage = in.nextInt();

        System.out.println("Result: " + calculate(num, percentage));
    }

    private int calculate(int num, int percentage)
    {
        return num * percentage / 100;
    }
}

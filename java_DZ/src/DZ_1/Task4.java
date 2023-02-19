package DZ_1;

import java.util.Scanner;

public class Task4 implements Runnable{

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int num;
        while (true){
            System.out.print("Input a six-digit number: ");
            num = in.nextInt();
            if (num < 100000 || num > 999999){
                System.out.println("Incorrect input");
                continue;
            }
            break;
        }

        System.out.println("Result: " + formatNumber(num));
    }

    private int formatNumber(int num)
    {
        int n = 0, digit;
        while (num > 0)
        {
            digit = num % 10;
            num = num / 10;
            n = n * 10;
            n = n + digit;
        }

        return n;
    }
}

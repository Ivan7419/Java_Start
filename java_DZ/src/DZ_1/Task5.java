package DZ_1;

import java.util.Scanner;

public class Task5 implements Runnable {

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int month;
        while (true) {
            System.out.print("Input a month number: ");
            month = in.nextInt();
            if (month < 1 || month > 12) {
                System.out.println("Incorrect input");
                continue;
            }
            break;
        }
        switch (month) {
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
        }
    }
}

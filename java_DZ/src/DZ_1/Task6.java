package DZ_1;

import java.util.Scanner;

public class Task6 implements Runnable {

    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int length, menu;
        System.out.print("Input length: ");
        length = in.nextInt();
        System.out.print("1.Miles\n2.Inches\n3.Yards\nConverts to:");
        menu = in.nextInt();
        switch (menu){
            case 1 -> System.out.println("Result: " + length * 0.000621);
            case 2 -> System.out.println("Result: " + length * 39.3701);
            case 3 -> System.out.println("Result: " + length * 1.09361);
            default -> System.out.println("Incorrect input");
        }
    }
}

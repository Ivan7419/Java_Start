package DZ_1;

import java.util.Scanner;

public class Task11 implements Runnable {
    @Override
    public void run() {
        Scanner in = new Scanner(System.in);
        int len, dir;
        char sym;
        System.out.print("Input length of line: ");
        len = in.nextInt();
        if (len < 0){
            System.out.print("Incorrect input");
            return;
        }
        System.out.print("1.Vertical\n2.Horizontal\nChoose direction: ");
        dir = in.nextInt();
        if (dir != 1 && dir != 2){
            System.out.print("Incorrect input");
            return;
        }
        System.out.print("Input symbol: ");
        sym = in.next().charAt(0);

        printLine(len, dir, sym);
    }

    private void printLine(int len, int dir, char sym)
    {
        if(dir == 1)
        {
            for (int i = 0; i < len; i++)
            {
                System.out.println(sym);
            }
        }

        else
        {
            for (int i = 0; i < len; i++) {
                System.out.print(sym);
            }
        }
    }
}

package ClassWork.February.Wednesday15;

import ClassWork.February.Wednesday15.Calculator.Operationable;

public class ClassWork implements Runnable{
    @Override
    public void run() {

    }

    private void doCalc()
    {
        Operationable plus = new Operationable()
        {

            @Override
            public int calc(int a, int b) {
                return a + b;
            }

            @Override
            public void print(int a, int b) {
                System.out.println(a + " + " + b);
            }
        };

        System.out.println(plus.calc(2,2));

        Operationable minus;
//        minus = (a, b) -> a - b;
//        System.out.println(minus.calc(3,1));
    }
    }
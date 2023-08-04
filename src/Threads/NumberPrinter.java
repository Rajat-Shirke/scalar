package Threads;

public class NumberPrinter implements Runnable{
    int number;
    public NumberPrinter(int i)
    {
        number =i;
    }
    @Override
    public void run() {
        System.out.println(number+" Printed by "+Thread.currentThread().getName());
    }
}

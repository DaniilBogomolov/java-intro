package ru.itis.join;

public class SumThread implements Runnable {

    private Thread thread;
    private int sum = 0;

    public SumThread() {
        thread = new Thread(this);
//        thread.setDaemon(true);
        thread.start();
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum in thread: " + sum);
//        while (true) {
//            System.out.println(thread.getName());
//        }
    }

}

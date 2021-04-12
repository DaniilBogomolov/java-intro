package ru.itis.arraysum;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CounterThread extends Thread {
    private int[] array;
    private int start;
    private int finish;


    public CounterThread(int[] array, int start, int finish) {
        this.array = array;
        this.start = start;
        this.finish = finish;
    }

    @Override
    public void run() {
        for (; start <= finish; start++) {
            // чтение mainSum
            // чтение array[start]
            // сложение mainSum + array[start]
            // запись (обновление) mainSum
            Main.mainSum.addAndGet(array[start]);
            // local_sum = Main.mainSum;
            // local_sum = local_sum + array[start]
            // Main.mainSum = local_sum
        }
    }
}

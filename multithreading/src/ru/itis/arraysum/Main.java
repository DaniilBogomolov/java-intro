package ru.itis.arraysum;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static AtomicInteger mainSum = new AtomicInteger(0);
    public static int expectedSum = 0;

    public static void main(String[] args) {
        int threadsCount = 10;
        int numbersCount = 100000;
        int[] array = new int[numbersCount];
        Random random = new Random();
        for (int i = 0; i < numbersCount; i++) {
            array[i] = random.nextInt(1000);
            expectedSum += array[i];
        }

        int step = numbersCount / threadsCount;
        CounterThread[] threads = new CounterThread[threadsCount];
        int left = 0;
        for (int i = 0; i < threadsCount; i++) {
            threads[i] = new CounterThread(array, left, left + step - 1);
            left += step;
            threads[i].start();
//            try {
//                threads[i].join();
//            } catch (InterruptedException e) {
//                throw new IllegalStateException(e);
//            }
        }

        for (CounterThread thread: threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        }

        System.out.println("Expected = " + expectedSum);
        System.out.println("Actual = " + mainSum);
    }
}

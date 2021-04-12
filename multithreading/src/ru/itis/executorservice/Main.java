package ru.itis.executorservice;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    // Порождение новых потоков - дорогостоящая операция
    // Время на создание (время на закрытие/уничтожение GC), ресурсы

    // ExecutorService (Thread Pool) - иметь фиксированное значение потоков
    // Передавать задачи и отдавать свободному, иначе класть в очередь

    public static void main(String[] args) throws IOException, InterruptedException {
        ExecutorService executorService = new ExecutorService(2);
        FileWriter fileWriter = new FileWriter("output.txt");
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        fileWriter.write(i + "\n");
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        fileWriter.write("abc" + i + "\n");
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        });
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        fileWriter.write(true + "\n");
                    } catch (IOException e) {
                        throw new IllegalStateException(e);
                    }
                }
            }
        });
        Thread.sleep(3000);
        fileWriter.flush();
        System.out.println("Worked!");
    }
}

package ru.itis.executorservice;

import java.util.Deque;
import java.util.concurrent.LinkedBlockingDeque;

public class ExecutorService {

    private Deque<Runnable> tasks;
    private WorkerThread[] threads;

    public ExecutorService(int threadsCount) {
        tasks = new LinkedBlockingDeque<>();
        threads = new WorkerThread[threadsCount];
        for (int i = 0; i < threadsCount; i++) {
            threads[i] = new WorkerThread();
            threads[i].start();
        }
    }

    public void submit(Runnable task) {
        synchronized (tasks) {
            tasks.add(task);
            tasks.notifyAll();
        }
    }

    class WorkerThread extends Thread {
        @Override
        public void run() {
            Runnable task;
            while (true) {
                synchronized (tasks) {
                    while (tasks.isEmpty()) {
                        try {
                            tasks.wait();
                        } catch (InterruptedException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    task = tasks.removeFirst();
                }
                task.run();
            }
        }
    }

}

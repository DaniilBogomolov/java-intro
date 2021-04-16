package ru.itis.decorator;

public class Reader {

    public void read(String filename) {
//        long start = System.currentTimeMillis();
//        ... чтение из файла
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
//        long finish = System.currentTimeMillis();
//        System.out.println("Метод исполнялся " + (finish - start) + " мс");
    }
}

package ru.itis.decorator;

public class ReadTimeCountReader extends Reader {

    private Reader reader;

    public ReadTimeCountReader(Reader reader) {
        this.reader = reader;
    }

    public void read(String filename) {
        System.out.println("Начинаю чтение...");
        long start = System.currentTimeMillis();
        reader.read(filename);
        long finish = System.currentTimeMillis();
        System.out.println("Метод исполнялся " + (finish - start) + " мс");
    }

}

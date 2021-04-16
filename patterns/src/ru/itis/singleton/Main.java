package ru.itis.singleton;


public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getLogger();
        logger1.log("123");
        Logger logger2 = Logger.getLogger();
        logger2.log("456");
    }
}

package ru.itis.sleep;

public class Main {

    public static void main(String[] args) {
        MyThread first = new MyThread();
        MyThread second = new MyThread();
        MyThread third = new MyThread();
        first.start();
        second.start();
        third.start();
    }
}

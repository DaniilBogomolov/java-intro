package ru.itis;

public class Computer extends Product {

    public Computer(String title, int price, String serial) {
        super(title, price, serial);
    }

    @Override
    public void selfTest() {
        System.out.println("Начинаю тестирование пк");
    }
}

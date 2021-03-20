package ru.itis;

import java.util.List;
import java.util.Map;

public class Phone extends Product implements Photoable {

    private String model;

    public Phone(String title, int price, String serial, String model) {
        super(title, price, serial);
        this.model = model;
    }

    public void selfTest() {
        System.out.println("Начинаю тестирование тф");
    }

    public void makePhoto() {
        System.out.println("Делаю фото");
    }
}

package ru.itis;

public class Computer {
    private String title;
    private int price;
    private String serial;

    public Computer(String title, int price, String serial) {
        this.title = title;
        this.price = price;
        this.serial = serial;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}

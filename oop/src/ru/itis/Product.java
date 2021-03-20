package ru.itis;

public abstract class Product {
    protected String title;
    int price;
    protected String serial;

    public Product(String title, int price, String serial) {
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


    public abstract void selfTest();
}

package ru.itis;

public class Cart {
//    private Computer[] computers;
//    private Phone[] phones;
    private Product[] products;
    private int count;
    private int sum;

    public Cart() {
        products = new Product[10];
        count = 0;
        sum = 0;
    }

    public Computer[] getComputers() {
        Computer[] computers = new Computer[count];
        for (int i = 0; i < count; i++) {
            products[i] = this.products[i];
        }
        return computers;
    }

    public int getCount() {
        return count;
    }

    public int getSum() {
        return sum;
    }


    public void addComputer(Computer computer) {
        if (count == products.length) {
            System.out.println("Превышен размер корзины");
        } else {
            products[count] = computer;
            count++;
            sum += computer.getPrice();
        }
    }

    public void removeComputer(Computer computer) {
        for (int i = 0; i < count; i++) {
            if (products[i].getSerial().equals(computer.getSerial())) {
//                Computer deleteComp = products[i];
//                products[i] = products[count - 1];
//                count--;
//                sum -= deleteComp.getPrice();
            }
        }
    }


}

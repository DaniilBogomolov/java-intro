package ru.itis;

public class Cart {
    private Computer[] computers;
    private int count;
    private int sum;

    public Cart() {
        computers = new Computer[10];
        count = 0;
        sum = 0;
    }

    public Computer[] getComputers() {
        Computer[] computers = new Computer[count];
        for (int i = 0; i < count; i++) {
            computers[i] = this.computers[i];
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
        if (count == computers.length) {
            System.out.println("Превышен размер корзины");
        } else {
            computers[count] = computer;
            count++;
            sum += computer.getPrice();
        }
    }

    public void removeComputer(Computer computer) {
        for (int i = 0; i < count; i++) {
            if (computers[i].getSerial().equals(computer.getSerial())) {
                Computer deleteComp = computers[i];
                computers[i] = computers[count - 1];
                count--;
                sum -= deleteComp.getPrice();
            }
        }
    }


}

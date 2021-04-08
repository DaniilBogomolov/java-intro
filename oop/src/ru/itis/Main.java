package ru.itis;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        User user = new User("email@mail.ru", "pass", 0);
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println(user.getBalance());
        System.out.println(user.getEmail());
        System.out.println(user.isCanOrder());

        User user1 = new User("123", "123");
        System.out.println(user1.isCanOrder());

        user1.setCanOrder(false);
        System.out.println(user.isCanOrder());
        System.out.println(User.isCanOrder());

        System.out.println("---------");
        System.out.println("12".compareTo("2"));
        System.out.println("---------");

//        phone.selfTest();
//        System.out.println(phone);
//        System.out.println(phone.toString());
//        System.out.println(phone.hashCode());
//        sum(1, 3);
//        sum(1L, 2L);

//        final int a;
//        a = 5;
        final int[] a = {1, 3, 5};
        a[0] = 5;
        System.out.println(Arrays.toString(a));
//        Phone phone = new Phone("phone", 213, "12dnsaj", "model");
//        Photoable product = new Phone("phone", 213, "12dnsaj", "model");
//        phone.makePhoto();
//        product.makePhoto();

        Product[] products = new Product[2];
        Product product =  new Computer("title", 123, "serial");
        products[1] = new Phone("phone", 213, "12dnsaj", "model");
        for (int i = 0; i < products.length; i++) {
            products[i].selfTest();
        }
    }
}

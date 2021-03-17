package ru.itis;

import java.util.Scanner;

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
    }
}

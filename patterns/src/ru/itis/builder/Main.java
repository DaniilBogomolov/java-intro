package ru.itis.builder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Даниил", null, null, null, null);
        Human newHuman = Human.builder()
                .setName("Даниил")
                .setSex("мужской")
                .build();
        System.out.println(newHuman);
    }
}

package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Команды для взаимодействия");
        System.out.println("1 - Поздоровайся со мной");
        System.out.println("2 - Выход");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int command = scanner.nextInt();
            if (command == 1) {
                String name = scanner.next();
                System.out.println("Привет, " + name);
            } else if (command == 2) {
                System.exit(0);
            } else {
                System.out.println("Не распознаю команду");
            }
        }
    }
}

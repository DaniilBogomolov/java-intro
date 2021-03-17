package ru.itis;

import java.util.Scanner;

public class MainRecursive {


    // Рекурсивная реализация с аккумулятом
    static int digitsCount(int n, int acc) {
        if (n <= 0) {
            return acc;
        } else {
            return digitsCount(n / 10, acc + 1);
        }
    }

    // Классическая рекурсивная реализация
    static int digitsCount(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return 1 + digitsCount(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // a > 0

        // Реализация подсчета цифр числа с помощью цикла
        int digitsCount = 0;
        while (a > 0) {
            a = a / 10;
            digitsCount++;
        }
        System.out.println(digitsCount(123, 0));
        System.out.println(digitsCount(123));
    }
}

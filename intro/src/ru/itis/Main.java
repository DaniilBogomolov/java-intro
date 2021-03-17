package ru.itis;

import java.util.Scanner;

public class Main {

    // поменять значение двух чисел местами
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    static void incr(int[] a) {
        a[0]++;
    }


    public static void main(String[] args) {
        int a = 5, b = 7;
        swap(a, b);
        System.out.println(a + " " + b);
        int arr[] = {1};
        incr(arr);
        System.out.println(arr);
        System.out.println(arr[0]);

        int[] array = {1, 2, 432, -1, 543}; // sum = 977, oddSum = 1

        int sum = 0; //сумма элементов
        int oddSum = 0; // сумма элементов на нечетных позициях
        for (int position = 0; position < array.length; position++) {
            sum = sum + array[position];
            if (position % 2 == 1) {
                oddSum = oddSum + array[position];
            }
        }

        for (int i = 1; i < array.length; i += 2) {
            oddSum = oddSum + array[i];
        }

        //       10 / 2 == 5    11 / 2 == 5
        //       10 % 2 == 0    11 % 2 == 1

    }
}

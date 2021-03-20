package ru.itis;

import java.util.Arrays;

public class HW {

    static int oddDigitsSum(int number) {
        if (number < 0) {
            number *= -1;
        }
        int sum = 0;
        int counter = digitsCount(number) % 2;
        while (number > 0) {
            if (counter % 2 == 1) {
                sum += number % 10;
            }
            counter++;
            number /= 10;
        }
        return sum;
    }

    // 412 => 2    412 % 10 => 2
    // 412 => 4    412 / 100 => 4     12 => 1  12 / 10

    static int digitsCount(int number) {
        int digits = 0;
        if (number == 0) return 1;
        while (number > 0) {
            digits++;
            number /= 10;
        }
        return digits;
    }

    /*
    12 => 32 16 8 4 2 1                  1100
    12 => 1100
    12 / 2 = 6         0
    6 / 2 = 3         00
    3 / 2 = 1        100
    1 / 2 = 0       1100



    0 0000000 => 0
    0 0001100 => 12
    1 0000001 =>
     */



    static String binary(int number) {
        StringBuilder builder = new StringBuilder();
        while (number > 0) {
            builder.append(number % 2);
            number /= 2;
        }
        return builder.reverse().toString();
    }

    static int[] reverse(int[] array) {
        for (int i = 0; i <= array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

//    static int toInt(int[] array) {

//    }

    static void between(int a, int b) {
        if (a == b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(a);
            between(a + 1, b);
        } else {
            System.out.println(a);
            between(a - 1, b);
        }
    }

    static boolean isPowerOfTwo(int number) {
//        32 => 16 => 8 => 4 => 2 => 1
        if (number == 1) {
            return true;
        } else {
            return number % 2 == 0 && isPowerOfTwo(number / 2);
        }
    }

    /*
    32
    32 % 2 == 0 и (32 / 2 - степень двойки) => 32 % 2 == 0 и 16 % 2 == 0 и (8 - степень двойки)

     */

    static boolean isPrime1(int number) {
//        1 - number нет таких чисел, что number % i == 0
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrime2(int number) {
        if (number % 2 == 0 && number != 2) {
            return false;
        }
        for (int i = 3; i < number; i+= 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    static int[] selectSort(int[] array) {
        // {12, 14, -2, 0, 1}
        // 1 итер {-2, 14, 12, 0, 1}
        // 2 итер {-2, 0, 12, 14, 1}
        for (int i = 0 ; i < array.length - 1; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
        return array;
    }


    public static void main(String[] args) {
        System.out.println(oddDigitsSum(324121));
        System.out.println(oddDigitsSum(-123));
        System.out.println(binary(12));

        int[] array = {12, 13, 3, 2, 5};
        System.out.println(Arrays.toString(reverse(array)));
        between(5, -3);
    }
}

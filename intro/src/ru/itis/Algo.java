package ru.itis;


public class Algo {

    // поиск элемента в массиве
    static int indexOf(int element, int[] array) {
        // если элемента в массиве нет, то -1
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return index;
    }

    // бинарный поиск в отсортированном массиве (ДЗ)
    static int binarySearch(int element, int[] array) {
        int index = -1;

        // Алгоритм

        return index;
    }


    public static void main(String[] args) {
        int[] a = {1, 3, 5, 10, 12 ,123};
        System.out.println(indexOf(5, a));
        System.out.println(binarySearch(5, a));
        // indexOf(element, a) == binarySearch(element, a)
    }
}

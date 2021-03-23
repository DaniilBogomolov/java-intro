package com.company;

public interface IntegerArray {
    void add(int element);
    void addAll(int[] elements);
    void remove(int index);
    int get(int index);
    int indexOf(int element); // если отсортирован -> бинарным поиском
    int length();
    void reverse();
    void sort();
    void print();
}

package com.company;

import java.util.Comparator;

public interface IntegerArray<T> {
    void add(T element);
    void addAll(T[] elements);
    void remove(int index);
    T get(int index);
    int indexOf(T element); // если отсортирован -> бинарным поиском
    int length();
    void reverse();
    void sort(Comparator<T> comparator);
    void print();
}

package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class IntegerArrayImpl<T> implements IntegerArray<T> {

    private T[] elements;
    private int count;
    private boolean isSorted; // внимательно следите за значением поля

    public IntegerArrayImpl() {
        this(10);
    }

    public IntegerArrayImpl(int defaultCapacity) {
        elements = (T[]) new Object[defaultCapacity];
        count = 0;
        isSorted = true;
    }

    private void ensureCapacity() {
        T[] newElements = (T[])new Object[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, count);
        elements = newElements;
    }

    @Override
    public void add(T element) {
        if (count == elements.length) {
            ensureCapacity();
        }
        elements[count] = element;
        count++;

    }

    @Override
    public void addAll(T[] elements) {
        int elementsCount = elements.length;
        while (elementsCount + count >= this.elements.length) ensureCapacity();
        for (T num : elements) {
            this.elements[count] = num;
            count++;
        }
    }

    @Override
    public void remove(int index) {
//        [1, 2, 3]   count = 3
//        remove(1)
//        [1, 3, 2]   count = 2
//        remove(0)
//        [2, 3, 3]   count = 2
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(elements, index + 1, elements, index, count - index - 1);
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException();
        }
        return elements[index];
    }

    @Override
    public int indexOf(T element) {
        return 0;
    }

    @Override
    public int length() {
        return count;
    }

    @Override
    public void reverse() {
        for (int i = 0; i <= count / 2; i++) {
            T temp = elements[i];
            elements[i] = elements[count - i - 1];
            elements[count - i - 1] = temp;
        }
    }


    @Override
    public void sort(Comparator<T> comparator) {
        quickSort(comparator, 0, count - 1);
    }

    private void quickSort(Comparator<T> comparator, int left, int right) {
//        [-1, 23, 0, -2, 123]
//                 |
//               pivot
//        [-1, -2, 0, 23, 123]
//        [123, 12, 1, 13, 5]

//        [-1, 23, 0, -2, 123]
//         |       |       |
//        left   pivot   right

//        [-1, 23, 0, -2, 123]
//             |   |   |
//             l   p   r
//        [-1, -2, 0, 23, 123]
//                 |
//               l,p,r
//        [-1, -2, 0, 23, 123]
//          |   |
//          l   p,r
        int i = left, j = right;
        T pivot = elements[(i + j) / 2];
        while (i <= j) {
            while (comparator.compare(elements[i], pivot) < 0) i++;
            while (comparator.compare(elements[i], pivot) > 0) j--;
            if (i <= j) {
                T temp = elements[i];
                elements[i] = elements[j];
                elements[j] = temp;
                i++; j--;
            }
        }
        if (left < j) quickSort(comparator, left, j);
        if (i < right) quickSort(comparator, i, right);
    }

    @Override
    public void print() {
        System.out.println(Arrays.toString(elements));
    }
}

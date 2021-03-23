package com.company;

public class IntegerArrayImpl implements IntegerArray {

    private int[] elements;
    private int count;
    private boolean isSorted; // внимательно следите за значением поля

    public IntegerArrayImpl() {
        this(10);
    }

    public IntegerArrayImpl(int defaultCapacity) {
        elements = new int[defaultCapacity];
        count = 0;
        isSorted = true;
    }

    private void ensureCapacity() {
//        ... увеличить массив в 2 раза
    }

}

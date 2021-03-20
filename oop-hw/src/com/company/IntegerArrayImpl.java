package com.company;

public class IntegerArrayImpl implements IntegerArray {

    private int[] elements;
    private int count;
    private boolean isSorted; // внимательно следите за значением поля

    public IntegerArrayImpl(int defaultCapacity) {
        elements = new int[defaultCapacity];
        count = 0;
        isSorted = true;
    }

}

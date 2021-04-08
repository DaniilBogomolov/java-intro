package ru.itis;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(123);
        integers.add(123);
        integers.add(12);
        System.out.println(integers.size());
        System.out.println(Arrays.toString(integers.toArray()));
    }
}

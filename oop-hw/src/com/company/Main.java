package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static int sum(List<? extends Number> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).intValue();
        }
        return sum;
    }

    public static void upper(List<? super Integer> list) {
        list.add(1);
        Object o = list.get(0);
    }

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        List<Number> list2 = new ArrayList<>();
        list2.add(1.0); list2.add(2.0); list2.add(3.0);
        System.out.println(sum(list));
        System.out.println(sum(list2));
        upper(list);
        upper(list2);





        IntegerArrayImpl<Integer> array = new IntegerArrayImpl<>();
        IntegerArrayImpl<Double> array2 = new IntegerArrayImpl<>();
        IntegerArrayImpl<String> array3 = new IntegerArrayImpl<>();
        IntegerArrayImpl array4 = new IntegerArrayImpl<>();


        array.add(-1);
        array.add(2);
        array.add(0);
        array.add(12);
        array.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        array.print();


        array3.add("123");
        array3.add("sad");
        array3.add("1fd");
        array3.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        array3.print();


        Human human1 = new Human("Human1", 20);
        Human human2 = new Human("Human2", 10);
        System.out.println(human1.equals(human2));
        System.out.println(human1.compareTo(human2));
    }
}

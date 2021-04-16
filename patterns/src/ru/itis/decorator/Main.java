package ru.itis.decorator;


import java.io.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = new ru.itis.decorator.Reader();
        reader.read("123");
        Reader decoratedReader = new ReadTimeCountReader(new Reader());
        decoratedReader.read("123");
        new BufferedReader(new InputStreamReader(System.in));
    }
}

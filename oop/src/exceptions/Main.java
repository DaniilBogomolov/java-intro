package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {


    public static int fib(int n) {
        if (n < 0) {
            throw new RuntimeException("Отрцательные числа не поддерживаются");
        } else {
            return 0; // count
        }
    }

    public static boolean foo() {
        return true;
    }

    public static void main(String[] args) {
//        DRY - Don't repeat yourself
//        YAGNI - You aren't gonna need it
//        KISS - Keep it simple stupid
        File file = new File("§2.iml");
//        try {
//            FileReader fileReader = new FileReader(file);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        FileReader fileReader = new FileReader(file);
//        System.out.println(2 / 0);

        // Unchecked vs Checked
//        throw new exceptions.AccessDeniedException("Access Denied");
//        System.out.println(fib(-1));
//        System.out.println("123");
    }
}

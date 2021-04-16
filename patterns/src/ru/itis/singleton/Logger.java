package ru.itis.singleton;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private static Logger INSTANCE;
    private FileWriter writer;

    private Logger() {
        try {
            writer = new FileWriter("log.txt");
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static Logger getLogger() {
        if (INSTANCE == null) { // Thread1
            // Thread1 -> Thread2
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

/*    public Logger() {
        try {
            writer = new FileWriter("log.txt");
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }*/

    public void log(String message) {
        try {
            writer.write(message + "\n");
            writer.flush();
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }
}

package org.pattern.decorator.example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainApplication {
    public static void main(String[] args) {
        int ch;

        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("src/main/java/org/pattern/decorator/example/text.txt")));

            while ((ch = inputStream.read()) >= 0) {
                System.out.print((char) ch);
            }

            inputStream.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

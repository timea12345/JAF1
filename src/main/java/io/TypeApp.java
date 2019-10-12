package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TypeApp {

    public static void main(String[] args) throws IOException {
        String filename = args[0];
        typeFile(filename);
    }

    static void typeFile(String filename) throws IOException {
        try(BufferedReader fileReader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        }
//        try (Reader fileReader = new FileReader(filename)) {
//            int ch = 0;
//            while((ch = fileReader.read()) != -1) {
//                System.out.println((char) ch);
//            }
//        }
    }
}

package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.exit;

public class IO {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream defaultOutput = System.out;
        PrintStream fileOutput = new PrintStream("file.txt");
        try {
            int c = 32;
           do {
               if (c != 10) {
                   System.out.println("introduceti un caracter");
                   c = System.in.read();
                   System.out.println((char) c);
               }
               c = System.in.read();
           }while (c != 32);
        } catch (IOException e) {
            System.out.println("exceptie la citire");
            exit(-1);
        }





    }
}
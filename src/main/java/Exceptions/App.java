package Exceptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class App {
        static {
            System.setProperty(org.slf4j.impl.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "INFO");
        }
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
//        double result = 5/0;
        try {
            System.out.println(division(1, 2));
            System.out.println(division(1, 0));
        } catch (IOException e) {
            LOGGER.error("a fost prinsa exceptia cu mesajul '{}'.", e.getMessage());
            System.out.println("catch 1");
        } catch (Exception e) {
            System.out.println("catch 2");
        } finally {
            System.out.println("finally");
        }
    }

    static double division(int a, int b) throws IOException {
       try {
           LOGGER.debug("urmeaza imp {} la {}", a, b);
           return a/b;
       } catch(ArithmeticException e) {
           throw new IOException("impartire la 0", e);
       }
    }
}

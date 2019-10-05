package number;

public class Counter {
    private static int counter;

    public Counter() {
        counter++;
    }

    public static int getValue() {
        return counter;
    }
}

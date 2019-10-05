package number;

public class App {

    public static void main(String[] args) {

        Number[] numbers = new Number[] {
                new Integer(10),
                new Double((3.14)),
                new Long(41),
        };
        System.out.println(sum(numbers));
    }

    public static Double sum(Number[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum;
    }
}

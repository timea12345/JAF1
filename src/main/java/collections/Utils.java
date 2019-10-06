package collections;

public class Utils {
    private Utils() {

    }
    public double getPointDistanceToOrigin(double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 2);
    }
}

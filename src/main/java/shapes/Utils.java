package shapes;

public class Utils {
    private Utils() {

    }
    public static double getPointDistanceToOrigin(double x, double y) {
        return Math.pow(x, 2) + Math.pow(y, 2);
    }
}

package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetApp {
    public static void main(String[] args) {
        Set<UncomparablePoint1> points = new HashSet<>();

        UncomparablePoint1 p1 = new UncomparablePoint1(1, 2);
        UncomparablePoint1 p2 = new UncomparablePoint1(5, 100);
        UncomparablePoint1 p3 = new UncomparablePoint1(7, 9);
        UncomparablePoint1 p4 = new UncomparablePoint1(7, 9);

        points.add(p1);
        points.add(p2);
        System.out.println(points.add(p3));
        System.out.println(points.add(p4));

        System.out.println(points);

    }
}

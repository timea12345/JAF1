package collections;

import java.util.HashMap;
import java.util.Map;

public class MappApp {

    public static void main(String[] args) {
        Map<UncomparablePoint1, String> descriptionByPoint = new HashMap<>();

        UncomparablePoint1 p1 = new UncomparablePoint1(1, 2);
        UncomparablePoint1 p2 = new UncomparablePoint1(5, 100);
        UncomparablePoint1 p3 = new UncomparablePoint1(7, 9);
        UncomparablePoint1 p4 = new UncomparablePoint1(7, 9);

        descriptionByPoint.put(p1, "punctul unu");
        descriptionByPoint.put(p2, "punctul doi");
        descriptionByPoint.put(p3, "punctul trei");
        descriptionByPoint.put(p4, "punctul patru");


        System.out.println(descriptionByPoint);
    }

}

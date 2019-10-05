package shapes;

public class AppShapes {

    public static void main(String[] args) {

//        Circle circle = new Circle(5D);
//        System.out.println(circle.getRadius());
//        System.out.println(circle.area());
//        System.out.println(circle.fillColor());
//        Circle c = new Circle(3D, 434, new Point(3,5));

        Circle circle1 = new Circle(3D);
        circle1.random();
        circle1.printDefaultFieldColour();

        Shape circle2 = new Circle(4D);
        System.out.println(((Circle)circle2).area());

    }

}

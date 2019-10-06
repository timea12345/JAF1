package shapes;

import javax.print.Doc;
import java.io.IOException;

public class Circle extends Shape implements Colorable {
    private Double radius;
    private Point center;

    Circle(Double radius) {
        System.out.println("Constructor circle");
        this.radius = radius;
    }

    Circle(Double radius, int colorCode, Point center) {
        this.radius = radius;
        this.colorCode = colorCode;
        this.center = center;
    }

    public double area() throws IOException {
        return Math.PI * Math.pow(radius, 2);
    }

    public int fillColor() {
        return this.colorCode;
    }

    public Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public void render() {
        System.out.println("Method implemented");
    }
}

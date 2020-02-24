package circle;

import circle.utils.Point;

public class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void enlarge(double f) {
        if (f > 0) {
            radius *= f;
        } else {
            System.out.println("Hiba");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}
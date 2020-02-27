package trig;

public class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double radius) {
        this(x, y);
        if (radius < 0) {
            throw new RuntimeException();
        }
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
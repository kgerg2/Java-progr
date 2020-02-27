package trig;

public class Line {
    private double a;
    private double b;
    private double c;

    public Line(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean contains(Point p) {
        return a * p.getX() + b * p.getY() == c;
    }

    public boolean isParallelWith(Line that) {
        return this.a * that.b == that.a * this.b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
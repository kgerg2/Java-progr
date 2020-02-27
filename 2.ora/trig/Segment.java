package trig;

public class Segment {
    private double x1;
    private double x2;
    private double y1;
    private double y2;

    public Segment(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Segment(Point p1, Point p2) {
        this(p1.getX(), p1.getY(), p2.getX(), p2.getY());
    }

    public Line line() {
        return new Line(y2 - y1, x1 - x2, (y2 - y1) * x1 - (x2 - x1) * y1);
    }

    public boolean contains(Point p) {
        return p.distance(new Point(x1, y1)) + p.distance(new Point(x2, y2)) 
                == new Point(x1, y1).distance(new Point(x2, y2));
    }

    public double orientation(Point p) {
        return (y2 - y1) * (p.getX() - x2) - (p.getY() - y2) * (x2 - x1);
    }

    public boolean intersects(Segment that) {
        return (this.orientation(that.getP1()) * this.orientation(that.getP2()) < 0
                && that.orientation(this.getP1()) * that.orientation(this.getP2()) < 0)
                || this.contains(that.getP1()) || this.contains(that.getP2())
                || that.contains(this.getP1()) || that.contains(this.getP2())
                || (this.orientation(that.getP1()) + this.orientation(that.getP2()) + that.orientation(this.getP1()) + that.orientation(this.getP2()) == 0
                        && (new Segment(this.getX1(), this.getX2(), 0, 0).contains(new Point(that.getX1(), 0))
                                || new Segment(this.getX1(), this.getX2(), 0, 0).contains(new Point(that.getX2(), 0)))
                        && (new Segment(this.getY1(), this.getY2(), 0, 0).contains(new Point(that.getY1(), 0))
                                || new Segment(this.getY1(), this.getY2(), 0, 0).contains(new Point(that.getY2(), 0))));
    }

    public Point getP1() {
        return new Point(x1, y1);
    }

    public Point getP2() {
        return new Point(x2, y2);
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }
}
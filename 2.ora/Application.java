package trig;

public class Application {

    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        p1.mirror(2, 2);
        System.out.println(p1.getX() + " " + p1.getY());

        Point p2 = new Point(3, 4);
        p2.mirror(p1);
        System.out.println(p2.getX() + " " + p2.getY());

        System.out.println(p1.distance(p2));

        Circle c1 = new Circle(3, 5, 3);
        Circle c2 = new Circle(40, 50, 30);
        Circle c3 = new Circle(20, 10, 3);
        c3.enlarge(5);
        System.out.println(c3.getRadius());
    }
}
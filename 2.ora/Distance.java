import trig.*;

public class Distance {
    public static void main(String[] args) {
        double d = 0;
        for (int i = 0; i < args.length - 2; i+=2) {
            Point p1 = new Point(Double.parseDouble(args[i]), Double.parseDouble(args[i+1]));
            Point p2 = new Point(Double.parseDouble(args[i+2]), Double.parseDouble(args[i+3]));
            d += p1.distance(p2);
        }
        System.out.println(d);
    }
}
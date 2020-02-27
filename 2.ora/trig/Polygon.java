package trig;

public class Polygon {
    public static void main(String[] args) {
        if (args.length < 6) {
            System.out.println(false);
            return;
        }

        Segment[] s = new Segment[args.length / 2];
        for (int i = 0; i < args.length - 2; i += 2) {
            s[i / 2] = new Segment(Double.parseDouble(args[i]),
                                   Double.parseDouble(args[i + 1]),
                                   Double.parseDouble(args[i + 2]),
                                   Double.parseDouble(args[i + 3]));
        }

        s[args.length / 2 - 1] = new Segment(Double.parseDouble(args[args.length - 2]),
                                             Double.parseDouble(args[args.length - 1]),
                                             Double.parseDouble(args[0]),
                                             Double.parseDouble(args[1]));

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < i - 1; j++) {
                if ((i != s.length - 1 || j != 0) && s[i].intersects(s[j])) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }
}
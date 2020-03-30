package circle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import circle.utils.Point;

public class Circle {
    private Point center;
    private double radius;
    private String label;
    private static final String defaultLabel = "unnamed";

    public Circle(Point center, double radius, String label) {
        this.center = new Point(center);
        this.radius = radius;
        this.label = label == null ? defaultLabel : label;
    }

    public Circle(Point center, double radius) {
        this(new Point(center), radius, null);
    }

    // public static Circle readFromFile(String fileName) throws IOException {
    // BufferedReader br = new BufferedReader(new FileReader(fileName));
    // double x = Double.parseDouble(br.readLine());
    // double y = Double.parseDouble(br.readLine());
    // double radius = Double.parseDouble(br.readLine());
    // String label = br.readLine();
    // br.close();
    // return new Circle(new Point(x, y), radius, label);
    // }

    public static Circle readFromFile(String fileName) {
        double x = 0;
        double y = 0;
        double radius = 0;
        String label = null;
        try (BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));) {
            x = Double.parseDouble(br.readLine());
            y = Double.parseDouble(br.readLine());
            radius = Double.parseDouble(br.readLine());
            label = br.readLine();
        } catch (IOException ioe) { }

        return new Circle(new Point(x, y), radius, label);
    }

    public void saveToFile(String fileName) throws FileNotFoundException {
        try (PrintWriter pw = new PrintWriter(fileName)) {
            pw.println(center.getX());
            pw.println(center.getY());
            pw.println(radius);
            pw.println(label);
        }
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
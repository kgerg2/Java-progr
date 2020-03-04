package util;

public class Main {
    public static void main(String[] args) {
        Vector v1 = new Vector(new float[]{1, 2, 3});
        Vector v2 = new Vector(new float[]{-1, 1, 0});
        System.out.println(v1.mult((float) 0.5));
        System.out.println(v1.mult(v2));
        System.out.println(v1.add(v2));
        System.out.println(v2.sub(v1));
    }
}
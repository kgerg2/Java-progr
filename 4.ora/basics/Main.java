package basics;

public class Main {
    public static void main(String[] args) {
        float[][] a = {{1, 3, -4}, {3, 7, 0}, {-3, 2, -1}};
        Matrix m = new Matrix(a);
        System.out.println(m);
        Matrix id = Matrix.id(3);
        System.out.println(id);
        System.out.println(m.add(id));
        System.out.println(m.sub(m));
    }
}
public class Sqrt2 {

    static double step(int i) {
        if (i < 0) {
            return 1;
        }
        return 2 + 1 / step(i - 1);
    }

    public static void main(String[] args) {
        System.out.println(step(1000) - 1);
    }
}
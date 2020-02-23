public class E {

    static double step(int i) {
        if (i > 1000) {
            return 1;
        }
        if (i % 3 == 0) {
            return i * 2 / 3 + 1 / step(i + 1);
        } else {
            return 1 + 1 / step(i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(step(1) + 1);
    }
}
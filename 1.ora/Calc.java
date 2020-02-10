public class Calc {

    static int factorialRec(int n) {
        if (n < 2) {
            return 1;
        } else {
            return n * factorialRec(n - 1);
        }
    }

    static int factorialIterative(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        // if (args.length < 2) {
        // return;
        // }
        if (args.length >= 2) {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            System.out.println(i + j);
            System.out.println(i - j);
            System.out.println(i * j);
            if (j != 0) {
                System.out.println(i / j);
            }
        }
        System.out.println(factorialIterative(10));
        System.out.println(factorialRec(10));
    }
}
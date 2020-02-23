public class GCD {

    static int gcd(int a, int b) {
        if (a % b == 0) {
            return a;
        } else {
            return gcd(b, b%a);
        }
    }

    public static void main(String[] args) {
        System.out.println(gcd(1, 6));
        System.out.println(gcd(4, 12));
        System.out.println(gcd(72, 21));
        System.out.println(gcd(0, 3));
    }
}
// tg.antalnagy27@gmail.com

public class Perfect {

    static boolean isPerfect(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
            }
        }
        return s == n;
    }

    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i] + ": " + isPerfect(Integer.parseInt(args[i])));
        }
        if (args.length > 0) {
            int c = 0;
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                if (isPerfect(i)) {
                    c++;
                    // System.out.println(i);
                }
            }
            if (c > 0) {
                System.out.println(c);
            } else {
                System.out.println("No numbers");
            }
        }
    }
}
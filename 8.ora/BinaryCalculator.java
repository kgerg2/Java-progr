
public class BinaryCalculator {
    public static void calculate(int a, int b) {
        doCalculate((long) a, (long) b);
    }
    public static void calculate(double a, double b) {
        doCalculate((long) a, (long) b);
    }
    public static void calculate(short a, short b) {
        doCalculate((long) a, (long) b);
    }
    public static void calculate(long a, long b) {
        doCalculate(a, b);
    }
    public static void calculate(float a, float b) {
        doCalculate((long) a, (long) b);
    }
    public static void calculate(String a, String b) {
        doCalculate(Long.parseLong(a), Long.parseLong(b));
    }

    private static void doCalculate(long a, long b) {
        System.out.println(String.format("%64s", Long.toBinaryString(a)).replace(" ", "0"));
        System.out.println(String.format("%64s", Long.toBinaryString(b)).replace(" ", "0"));
        System.out.println(String.format("%64s", Long.toBinaryString(a & b)).replace(" ", "0"));
        System.out.println(String.format("%64s", Long.toBinaryString(a | b)).replace(" ", "0"));
        System.out.println(String.format("%64s", Long.toBinaryString(a ^ b)).replace(" ", "0"));
        System.out.println(String.format("%64s", Long.toBinaryString(~a)).replace(" ", "0"));
        System.out.println(String.format("%64s", Long.toBinaryString(~b)).replace(" ", "0"));
    }
}
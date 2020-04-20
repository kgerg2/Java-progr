public class Main {
    public static void main(String[] args) {
        BinaryCalculator.calculate("4", "3");
        BinaryCalculator.calculate(4L, 3L);
        BinaryCalculator.calculate(4.0, 3.0);
        BinaryCalculator.calculate((float) 4, (float) 3);
        BinaryCalculator.calculate(4, 3);
        BinaryCalculator.calculate((short) 4, (short) 3);
    }
}
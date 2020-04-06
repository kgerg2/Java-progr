/**
 * Adder
 */
public class Adder {
    public static String add(String a, String b) {
        try {
            return Integer.toString(Integer.parseInt(a) + Integer.parseInt(b));
        } catch (NumberFormatException nfe) {
            try {
                return Double.toString(Double.parseDouble(a) + Double.parseDouble(b));
            } catch (NumberFormatException nfe2) {
                throw new IllegalArgumentException();
            }
        }
    }
}
package pizza;

/**
 * Pizza
 */
public class Pizza {
    private final double radius;
    private final String[] toppings;
    private final Time makeTime;
    private final Time deliveryTime;
    static private final String[] POSSIBLE_TOPPINGS = new String[] { "beef", "cheese", "corn", "fish", "ham",
            "mushroom", "salami", "tomato" };

    public Pizza(double radius, String[] toppings, Time deliveryTime) throws TypeNotPresentException {
        if (radius <= 0) {
            throw new IllegalArgumentException();
        }
        this.radius = radius;
        this.deliveryTime = new Time(deliveryTime);
        double seconds = 0;
        for (String topping : toppings) {
            if (java.util.Arrays.binarySearch(POSSIBLE_TOPPINGS, topping) < 0) {
                throw new TypeNotPresentException(topping, null);
            }
            seconds += radius * topping.length();
        }
        this.toppings = java.util.Arrays.copyOf(toppings, toppings.length);
        this.makeTime = new Time((int) Math.ceil(seconds/60));
    }

    public Time getMakeTime() {
        return new Time(makeTime);
    }
}
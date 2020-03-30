package auto;

import auto.utils.Color;

/**
 * Auto class, stores license plate number, color and maximum speed of cars.
 * Counts the number of cars created.
 */
public class Auto {
    private String license;
    private Color color;
    private int maxSpeed;

    private static int counter = 0;

    /**
     * Constructor of Auto class.
     * @param licence the license plate number of the auto
     * @param color the color of the car
     * @param maxSpeed the maximum speed of the vehicle
     */
    public Auto(String licence, Color color, int maxSpeed) {
        this.license = licence;
        this.color = color;
        this.maxSpeed = maxSpeed;
        counter++;
    }

    /**
     * Constructor of Auto class. Uses default values: "AAA-000", BLUE, 120
     */
    public Auto() {
        this("AAA-000", Color.BLUE, 120);
    }

    /**
     * Compares two cars and returns true if the first is faster than the second
     * @param first Auto to compare
     * @param second Auto to compare
     * @return True if the first is faster
     */
    public static boolean faster(Auto first, Auto second) {
        return first.maxSpeed > second.maxSpeed;
    }
}
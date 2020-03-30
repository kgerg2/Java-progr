public enum TelevisionShop {
    SAMSUNG(15, 30.5, 72), LG(15, 30.5, 92), SKYWORTH(5, 35, 40), SONY(15, 20.5, 70), SHARP(10, 30.5, 72);

    private final int count;
    private final double maxSize;
    private final double minSize;

    TelevisionShop(final int count, final double minSize, final double maxSize) {
        this.count = count;
        this.maxSize = maxSize;
        this.minSize = minSize;
    }

    public void printSizes() {
        System.out.println("maximum: " + maxSize + ", minimum: " + minSize);
    }

    public static void printAll() {
        for (final TelevisionShop t : TelevisionShop.values()) {
            System.out.print(t + " televisions (" + t.count + " pieces) with sizes ");
            t.printSizes();
        }
    }

    public static void printExtremes() {
        final double max = java.util.Arrays.stream(TelevisionShop.values()).mapToDouble(t -> t.maxSize).max().getAsDouble();
        final double min = java.util.Arrays.stream(TelevisionShop.values()).mapToDouble(t -> t.minSize).min().getAsDouble();
        System.out.println("maximum: " + max + ", minimum: " + min);
    }
}
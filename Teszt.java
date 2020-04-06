public class Teszt {
    /**
     * Teszt kódok
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Object l = new int[2];
        // l[1] = 2;
        // l[0] = 1;
        // System.out.println(l);
        // int[] l = new int[10];
        // java.util.Arrays.setAll(l, i -> i);
        // java.util.Arrays.stream(l).map(x -> 2*x).filter(x -> x%3 ==
        // 0).forEach(System.out::println);
        String s = null;
        try {
            System.out.print("1");
            s.length();
            System.out.print("2");
        } catch (NullPointerException e) {
            System.out.print("3");
        } catch (Exception e) {
            System.out.print("4");
        }
    }
}
package pizza;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    static Time readPizzas(String fileName) throws IOException {
        List<Pizza> list = new ArrayList<Pizza>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            while (br.ready()) {
                try {
                    String[] line = br.readLine().split(" ");
                    if (line.length != 3) {
                        throw new IllegalArgumentException();
                    }
                    list.add(new Pizza(Double.parseDouble(line[0]), line[1].split(","), Time.parseTime(line[2])));
                } catch (TypeNotPresentException tnpe) {
                    System.out.println("Cannot make requested topping. Skipping order.");
                } catch (IllegalArgumentException iae) {
                    System.out.println("Order is wrong format. Skipping order.");
                }
            }
        }
        return list.stream().map(p -> p.getMakeTime()).reduce(new Time(), Time::add);
    }

    public static void main(String[] args) {
        try {
            System.out.println("The time to finish all pizzas is: " + readPizzas(args[0]).getString());
        } catch (IOException ioe) {
            System.out.println("File not found");
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Provide a file containing the orders as a command line argunemt.");
        }
    }
}
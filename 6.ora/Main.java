import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import auto.Auto;
import auto.utils.Color;

/**
 * Main class to test the auto package.
 */
public class Main {

    /**
     * The sterting point of the program.
     * @param args command line arguments
     */
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(".\\6.ora\\input.txt"))) {
            List<Auto> autos = new ArrayList<Auto>();
            while (br.ready()) {
                String[] line = br.readLine().split(",");
                autos.add(new Auto(line[0], Color.valueOf(line[1]), Integer.parseInt(line[2])));
            }
        } catch (IOException ioe) {
            System.out.println("A fájl olvasása sikertelen.");
        }
    }
}
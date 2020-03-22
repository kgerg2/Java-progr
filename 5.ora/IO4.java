import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class IO4 {

    public static void main(String[] args) {
        final Path PATH = Paths.get("in.txt");
        try (BufferedReader br = Files.newBufferedReader(PATH)) {
            if (args.length != 1) {
                throw new NoSuchElementException("Pontosan egy argumentum kell.");
            }
            int sklen = Integer.parseInt(args[0]);
            Scanner sc = new Scanner(System.in);
            int len;
            try {
                len = sc.nextInt();
            } catch (NoSuchElementException nsee) {
                throw new NoSuchElementException("Egy számot kell megadni.");
            }    
            System.out.println(len);
            for (int i = 0; i < len; i++) {
                System.out.println(Character.toChars(br.read()));
                br.skip(sklen);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NoSuchElementException nsee) {
            System.out.println(nsee.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("A parancssori argumentum egy egész szám kell, hogy legyen.");
        }
    }
}
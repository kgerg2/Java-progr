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
            int len = sc.nextInt();
            for (int i = 0; i < len; i++) {
                System.out.println(br.read());
                br.skip(sklen);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (NoSuchElementException nsee) {
            System.out.println(nsee.getMessage());
        }
    }
}
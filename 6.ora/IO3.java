import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/** 
 * @author Valaki Neve
 * @since 1.0
 * @version 1.0
 */
public class IO3 {
    /**
     * The starting point of the application. {@code main}
     * @param args commandline args
     * @throws IllegalArgumentException
     * @throws IOException
     */
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException("Pontosan egy argumentum kell");
        }
        Scanner sc = new Scanner(System.in);
        String tokenToFind = sc.next();
        final Path THE_PATH = Paths.get(args[0]);
        try (BufferedReader br = Files.newBufferedReader(THE_PATH)) {
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                sum += line.contains(tokenToFind) ? 1 : 0;
            }
            System.out.println(sum);
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
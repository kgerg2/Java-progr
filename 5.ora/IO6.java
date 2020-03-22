import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IO6 {
    public static void main(String[] args) {
        try (BufferedReader br = Files.newBufferedReader(Paths.get("nums.txt"));
                BufferedWriter bw = Files.newBufferedWriter(Paths.get("out.txt"))) {
            int n;
            while (true) {
                try {
                    n = Integer.parseInt(br.readLine());
                } catch (NumberFormatException nfe) {
                    break;
                }
                bw.write(String.valueOf(n));
                bw.write(" is an ");
                bw.write(n % 2 == 0 ? "even" : "odd");
                bw.write(" number\n");
            }
        } catch (IOException ioe) {
            System.out.println("Cannot open file.");
        }
    }
}
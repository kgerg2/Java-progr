import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class IO2 {
    public static final Path THE_PATH = Paths.get("5.ora/in.txt");
    public static final Path THE_PATH2 = Paths.get("5.ora/out.txt");

    public static void main(String[] args) {
        try (
            BufferedReader br = Files.newBufferedReader(THE_PATH);
            BufferedWriter bw = Files.newBufferedWriter(THE_PATH2);
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                int sum = 0;
                for (String var : tokens) {
                    sum += Integer.parseInt(var);
                }
                bw.write(sum);
                bw.write("\n");
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
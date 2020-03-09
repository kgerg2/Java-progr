import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class IO1 {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("5.ora/in.txt"));
            PrintWriter pw = new PrintWriter("5.ora/out.txt");
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                int sum = 0;
                for (String var : tokens) {
                    sum += Integer.parseInt(var);
                }
                pw.println(sum);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
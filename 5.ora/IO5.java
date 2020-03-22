import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class IO5 {
    public static void main(String[] args) {
        int sum, nums[], pos;
        String[] lines;
        try (BufferedReader br = Files.newBufferedReader(Paths.get("in.txt"))) {
            while (true) {
                try {
                    lines = br.readLine().split(" ");
                } catch (NullPointerException npe) {
                    break;
                }
                sum = Integer.parseInt(lines[0]);
                System.out.print(sum);
                lines = lines[1].split(",");
                nums = new int[lines.length];
                for (int i = 0; i < lines.length; i++) {
                    nums[i] = Integer.parseInt(lines[i]);
                }
                Arrays.sort(nums);
                pos = 0;
                for (int i = 0; i < nums.length; i++) {
                    pos = Arrays.binarySearch(nums, i + 1, nums.length, sum - nums[i]);
                    if (pos >= 0) {
                        System.out.println(" " + nums[i] + " " + nums[pos]);
                        break;
                    }
                }
                if (pos < 0) {
                    System.out.println(" none");
                }
            }
        } catch (IOException ioe) {
            System.out.println("Nem található a fájl.");
        }
    }
}
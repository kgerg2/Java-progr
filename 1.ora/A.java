import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            String s = System.console().readLine();
            System.out.println("Hello " + s);
        }
    }
}
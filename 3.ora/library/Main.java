package library;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("HP", "Agatha Chistie", 1921, false);
        Book b2 = new Book("HP", "J. K. Rowling", 1999, true);
        Book b2_old = new Book("HP", "J. K. Rowling", 1999, false);
        Book b1_copy = new Book(b1);

        System.out.println(b1.equals(b1_copy));
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.equals(b2));
        System.out.println(b2);
        System.out.println(b2_old);
        System.out.println(b2.equals(b2_old));
    }
}
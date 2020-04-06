/**
 * Book
 */
public class Book {

    static enum Genre {
        FANTASY, SATIRE, SCIFI, PHILOSOPHY, EDUCATIONAL;
    }

    private final String author;
    private final String title;
    private final int price;
    private final int id;
    private final Genre genre;

    private static int lastId/*  = 0 */;

    public static void resetId() {
        lastId = 0;
    }

    private Book(String author, String title, Genre genre, int price) {
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        id = lastId++;
    }

    public static Book make(String author, String title, String genreName, String priceStr) {
        try {
            int reservePrice = Integer.parseInt(priceStr);

            if (author == null || title == null || reservePrice <= 0 || title.length() < 2) {
                return null;
            }

            Genre g = Genre.valueOf(genreName);

            int i = 0;
            while (i < title.length()) {
                if (Character.isDigit(title.charAt(i)) || Character.isLetter(title.charAt(i)) || Character.isWhitespace(title.charAt(i))) {
                    i++;
                } else {
                    return null;
                }
            }

            return new Book(author, title, g, reservePrice);
        } catch (NumberFormatException nfe) {
            return null;
        } catch (IllegalArgumentException iae) {
            return null;
        }
    }

    public static boolean isSameGenre(Book b1, Book b2) {
        return b1.genre == b2.genre;
    }

    public int compare(Book that) {
        if (!isSameGenre(this, that)) {
            throw new IllegalArgumentException();
        }
        // return this.price < that.price ? -1 : this.price == that.price ? 0 : 1;
        return Integer.compare(this.price, that.price);
    }
}
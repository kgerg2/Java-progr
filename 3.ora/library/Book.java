package library;

public class Book {
    private String title;
    private String author;
    private int date;
    private boolean av;

    public Book(String title, String author, int date, boolean av) {
        this.title = title;
        this.author = author;
        this.date = date;
        this.av = av;
    }

    public Book(Book b) {
        if (b == null) {
            throw new IllegalArgumentException();
        }
        this.title = b.title;
        this.author = b.author;
        this.date = b.date;
        this.av = b.av;
    }

    @Override
    public String toString() {
        return author + ": " + title + " (" + date + ") " + (av ? "" : "currently not ") + "available";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Book)) {
            return false;
        }
        Book b = (Book) obj;
        return this.title == b.title && this.author == b.author && this.date == b.date;
    }
}
public class Caesar {
    private int n;

    public Caesar(int n) {
        if (n < 1 || n > 25) {
            throw new IllegalArgumentException();
        }
        this.n = n;
    }

    public String cipher(String s) {
        return new String(s.chars().map(x -> {
            if (x >= 'a' && x <= 'z')
                return (x - 'a' + n) % 26 + 'a';
            if (x >= 'A' && x <= 'Z')
                return (x - 'A' + n) % 26 + 'A';
            throw new IllegalArgumentException();
        }).toArray(), 0, s.length());
    }

    public String decipher(String s) {
        return new String(s.chars().map(x -> x >= 'a' && x <= 'z' ? (x - 'a' - n + 26) % 26 + 'a' : (x - 'A' - n + 26) % 26 + 'A')
                .toArray(), 0, s.length());
    }
}
package stringutils;

public class IterWord {
    private String[] s;
    private int count;

    public IterWord(String s) {
        int len = s.length() - s.replace(" ", "").length() + 1;
        this.s = new String[len];
        int pos = -1, next;
        for (int i = 0; i < len - 1; i++) {
            next = s.indexOf(' ', pos + 1);
            this.s[i] = s.substring(pos + 1, next);
            pos = next;
        }
        this.s[this.s.length - 1] = s.substring(pos+1);
        count = 0;
    }

    public void printNext() {
        System.out.println(s[count++]);
    }

    public void restart() {
        count = 0;
    }

    public boolean hasNext() {
        return count < s.length;
    }

    public static void main(String[] args) {
        IterWord s = new IterWord("Ez egy szavakból álló szöveg.");
        while (s.hasNext()) {
            s.printNext();
        }
        s.restart();
        s.printNext();
    }
}
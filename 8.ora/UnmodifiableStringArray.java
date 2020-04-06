import java.util.Arrays;

public class UnmodifiableStringArray {
    private final String[] strArr;

    public UnmodifiableStringArray(String[] strArr) {
        this.strArr = Arrays.copyOf(strArr, strArr.length);
    }

    public static UnmodifiableStringArray empty() {
        return new UnmodifiableStringArray(new String[0]);
    }

    public String get(int index) {
        if (index < 0 || index >= strArr.length) {
            throw new IllegalArgumentException();
        }
        return strArr[index];
    }

    public String find(String str) {
        for (String string : strArr) {
            if (string.equals(str)) {
                return string;
            }
        }
        return null;
    }

    public boolean contains(String str) {
        for (String string : strArr) {
            if (string.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void sort() {
        Arrays.sort(strArr);
    }

    public String[] getAllItems() {
        return Arrays.copyOf(strArr, strArr.length);
    }

    public int size() {
        return strArr.length;
    }

    public int maxLength() {
        int max = -1;
        for (String string : strArr) {
            max = max > string.length() ? max : string.length();
        }
        return max;
    }

    public int minLength() {
        int min = Integer.MAX_VALUE;
        for (String string : strArr) {
            min = min > string.length() ? min : string.length();
        }
        return min;
    }

    public int allLength() {
        int sum = 0;
        for (String string : strArr) {
            sum += string.length();
        }
        return sum;
    }
}
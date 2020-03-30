package pizza;

/**
 * Time
 */
public class Time {
    private int hour;
    private int minute;

    public Time(int hour, int minute) {
        if (hour >= 24 || hour < 0 || minute >= 60 || minute < 0) {
            throw new IllegalArgumentException();
        }
        this.hour = hour;
        this.minute = minute;
    }

    public Time(int seconds) {
        this((seconds / 60) % 24, seconds % 60);
    }

    public Time() {
        this(0);
    }

    public Time(Time time) {
        this(time.hour, time.minute);
    }

    public static Time parseTime(String time) throws IllegalArgumentException {
        String[] l = time.split(":");
        if (l.length != 2) {
            throw new IllegalArgumentException();
        }
        try {
            return new Time(Integer.parseInt(l[0]), Integer.parseInt(l[1]));
        } catch (NumberFormatException nfe) {
            throw new IllegalArgumentException();
        }
    }

    public Time add(Time that) {
        return new Time(this.hour * 60 + this.minute + that.hour * 60 + that.minute);
    }

    public String getString() {
        return String.format("%02d:%02d", this.hour, this.minute);
    }
}
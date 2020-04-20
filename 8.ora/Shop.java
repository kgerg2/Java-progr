import java.util.ArrayList;

public class Shop {
    private int mask;
    private int toiletPaper;
    private int handSanitizer;

    private ArrayList<Runnable> subscribers = new ArrayList<>();

    public Shop(int mask, int toiletPaper, int handSanitizer) {
        this.mask = mask;
        this.toiletPaper = toiletPaper;
        this.handSanitizer = handSanitizer;
    }

    public CustomerStatus buyMask(int n) {
        mask = mask > n ? mask - n : 0;
        if (mask >= n) {
            return CustomerStatus.FEELS_SAFE;
        } else if (mask > 0) {
            return CustomerStatus.NEUTRAL;
        } else {
            return CustomerStatus.PANICS;
        }
    }

    public CustomerStatus buyToiletPaper(int n) {
        toiletPaper = toiletPaper > n ? toiletPaper - n : 0;
        if (toiletPaper >= n) {
            return CustomerStatus.FEELS_SAFE;
        } else if (toiletPaper > 0) {
            return CustomerStatus.NEUTRAL;
        } else {
            return CustomerStatus.PANICS;
        }
    }

    public CustomerStatus buyHandSanitizer(int n) {
        handSanitizer = handSanitizer > n ? handSanitizer - n : 0;
        if (handSanitizer >= n) {
            return CustomerStatus.FEELS_SAFE;
        } else if (handSanitizer > 0) {
            return CustomerStatus.NEUTRAL;
        } else {
            return CustomerStatus.PANICS;
        }
    }

    public void subscribe(Runnable shop) {
        subscribers.add(shop);
    }

    public void notifyCustomer() {
        for (Runnable subscr : subscribers) {
            subscr.run();
        }
    }
}
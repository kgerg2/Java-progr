import java.util.Arrays;
import java.util.Random;

class Customer {
    public CustomerStatus status = CustomerStatus.FEELS_SAFE;

    public void newPurcashe(CustomerStatus status) {
        if (this.status.compareTo(status) < 0) {
            this.status = status;
        }
    }
}

public class Simulator {
    public static void main(String[] args) {
        int n = 4;
        Shop shop = new Shop(15, 30, 20);
        Customer[] customers = new Customer[n];
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            Customer c = new Customer();
            customers[i] = c;
            shop.subscribe(() -> c.newPurcashe(shop.buyHandSanitizer(r.nextInt(10) + 1)));
            shop.subscribe(() -> c.newPurcashe(shop.buyMask(r.nextInt(10) + 1)));
            shop.subscribe(() -> c.newPurcashe(shop.buyToiletPaper(r.nextInt(10) + 1)));
        }

        shop.notifyCustomer();

        for (CustomerStatus status : CustomerStatus.values()) {
            System.out.println(status + ": " + Arrays.stream(customers).filter(x -> status.equals(x.status)).count());
        }
    }
}
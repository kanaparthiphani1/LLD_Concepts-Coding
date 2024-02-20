package Behavioural.Strategy;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        ShoppingCart shp = new ShoppingCart(List.of("iphone","airpods","visionPro"),new PhonePeStrategy());
        shp.getPaymentStrtegy().pay();
    }
}

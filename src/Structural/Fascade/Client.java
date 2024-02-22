package Structural.Fascade;

public class Client {
    public static void main(String[] args) {
        OrderFascade or = new OrderFascade();
        or.createOrder();
    }
}

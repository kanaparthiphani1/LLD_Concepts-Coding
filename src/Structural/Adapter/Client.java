package Structural.Adapter;

public class Client {
    public static void main(String[] args) {
        PaymentAdapter pa = new PhonePeAdapter();
        pa.doPayment();
        PaymentAdapter pa2 = new GpayAdapter();
        pa2.doPayment();
    }
}

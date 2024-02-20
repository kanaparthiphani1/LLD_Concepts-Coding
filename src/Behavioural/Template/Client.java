package Behavioural.Template;

public class Client {
    public static void main(String[] args) {
        PaymentTemplate tmp = new PhonePe();
        tmp.pay();
        PaymentTemplate tmp2 = new GooglePay();
        tmp2.pay();
    }
}

package Structural.Adapter;

public class PhonePeAdapter implements PaymentAdapter{

    private PhonePePayment phonePePayment;

    public PhonePeAdapter() {
        this.phonePePayment = new PhonePePayment();
    }

    @Override
    public void doPayment() {
        phonePePayment.makePayment();
    }

    @Override
    public void checkBalance() {
        phonePePayment.checkBalance();
    }
}

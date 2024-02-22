package Structural.Adapter;

public class GpayAdapter implements PaymentAdapter{
    private GooglePayPayment gpay;

    public GpayAdapter() {
        this.gpay = new GooglePayPayment();
    }

    @Override
    public void doPayment() {
        gpay.sendMoney();
    }

    @Override
    public void checkBalance() {
        gpay.getBalance();
    }
}

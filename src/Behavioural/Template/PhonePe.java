package Behavioural.Template;

public class PhonePe extends PaymentTemplate{
    @Override
    public void validateRequest() {
        System.out.println("Phonepe validation");
    }

    @Override
    public void debitAmount() {
        System.out.println("Phonepe debit");

    }

    @Override
    public void calculateFee() {
        System.out.println("Phonepe fee calc");

    }

    @Override
    public void creditAmount() {
        System.out.println("Phonepe credit");

    }
}

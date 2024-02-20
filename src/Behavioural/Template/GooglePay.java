package Behavioural.Template;

public class GooglePay extends PaymentTemplate{

    @Override
    public void validateRequest() {
        System.out.println("GPay validate");
    }

    @Override
    public void debitAmount() {
        System.out.println("GPay Debit");

    }

    @Override
    public void calculateFee() {
        System.out.println("GPay Fee");

    }

    @Override
    public void creditAmount() {
        System.out.println("GPay Credit");

    }
}

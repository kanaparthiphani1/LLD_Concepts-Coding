package Behavioural.Template;

public abstract class PaymentTemplate {
    public abstract void validateRequest();
    public abstract void debitAmount();
    public abstract void calculateFee();
    public abstract void creditAmount();

    public final void pay(){
        validateRequest();
        debitAmount();
        calculateFee();
        creditAmount();
    }
}

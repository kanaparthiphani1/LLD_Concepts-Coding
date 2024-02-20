package Behavioural.Strategy;

public class PhonePeStrategy implements PaymentStrtegy{

    @Override
    public void pay() {
        System.out.println("Paying with PhonePe");
    }
}

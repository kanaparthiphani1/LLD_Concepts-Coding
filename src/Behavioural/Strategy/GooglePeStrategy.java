package Behavioural.Strategy;

public class GooglePeStrategy implements PaymentStrtegy{

    @Override
    public void pay() {
        System.out.println("Paying with Google Pay");
    }
}

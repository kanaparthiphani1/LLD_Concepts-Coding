package Behavioural.Strategy;

import java.util.List;

public class ShoppingCart {
    private List<String> items;
    private PaymentStrtegy paymentStrtegy;

    public ShoppingCart(List<String> items, PaymentStrtegy paymentStrtegy) {
        this.items = items;
        this.paymentStrtegy = paymentStrtegy;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }

    public PaymentStrtegy getPaymentStrtegy() {
        return paymentStrtegy;
    }

    public void setPaymentStrtegy(PaymentStrtegy paymentStrtegy) {
        this.paymentStrtegy = paymentStrtegy;
    }
}

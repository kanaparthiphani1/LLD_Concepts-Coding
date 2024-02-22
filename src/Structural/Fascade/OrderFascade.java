package Structural.Fascade;

public class OrderFascade {
    private Product prod;
    private Invoice inv;
    private Notification not;

    public OrderFascade() {
        this.prod = new Product();
        this.inv = new Invoice();
        this.not = new Notification();
    }

    public void createOrder(){
        prod.getProduct();
        inv.createInvoice();
        not.sendNotification();
    }
}

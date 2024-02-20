package Behavioural.Mediator;

public class Bidder implements Colleague{
    private Mediator md;
    private String name;

    public Bidder(Mediator md, String name) {
        this.md = md;
        this.name = name;
    }

    @Override
    public void placeBid(int amount) {
        md.placeBid(this,amount);
    }

    @Override
    public void getNotified(int bidAmount) {
        System.out.println( name + " [Notification] :  Bid Amount is "+bidAmount);
    }

    @Override
    public String getName() {
        return name;
    }
}

package Behavioural.Mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements Mediator{
    private List<Colleague> lis;

    public Auction() {
        this.lis = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague cg) {
        this.lis.add(cg);
    }

    @Override
    public void placeBid(Colleague cg, int amount) {
        for(Colleague c:lis){
            if(!c.getName().equals(cg.getName())){
                c.getNotified(amount);
            }
        }
    }
}

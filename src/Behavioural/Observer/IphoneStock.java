package Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class IphoneStock implements Observable<Integer>{

    private List<Observer> lis;
    private Integer stock;

    public IphoneStock() {
        this.lis = new ArrayList<>();
        this.stock = 0;
    }

    @Override
    public void addObserver(Observer ob) {
        this.lis.add(ob);
    }

    @Override
    public void removeObserver(Observer ob) {
        this.lis.remove(ob);
    }

    @Override
    public void notifyObservers() {
        for(Observer ob : lis){
            ob.update();
        }
    }

    public Integer getData() {
        return stock;
    }

    public void setStock(int temp) {
        if(temp!=stock){
           this.stock = temp;
           notifyObservers();
        }
    }
}

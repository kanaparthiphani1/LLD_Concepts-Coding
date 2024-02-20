package Behavioural.Observer;

public class BigC<T> implements Observer{
    private Observable<T> obs;

    public BigC(Observable<T> obs) {
        this.obs = obs;
    }

    @Override
    public void update() {
        System.out.println("BigC is notified that stock of iphone is "+obs.getData());
    }
}

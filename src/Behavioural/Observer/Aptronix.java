package Behavioural.Observer;

public class Aptronix<T> implements Observer{

    private Observable<T> obs;

    public Aptronix(Observable<T> obs) {
        this.obs = obs;
    }

    @Override
    public void update() {
        System.out.println("Aptronix is notified that stock increased to "+ obs.getData());
    }
}

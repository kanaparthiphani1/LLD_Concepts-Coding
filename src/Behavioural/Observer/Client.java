package Behavioural.Observer;

public class Client {
    public static void main(String[] args) {
        Observable<Integer> obs = new IphoneStock();
        Observer ob = new Aptronix<Integer>(obs);
        Observer ob2= new BigC<Integer>(obs);
        obs.addObserver(ob);
        obs.addObserver(ob2);
        obs.setStock(12);
    }
}

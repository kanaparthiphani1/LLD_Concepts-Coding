package Behavioural.Observer;

public interface Observable<T> {
    public void addObserver(Observer ob);
    public void removeObserver(Observer ob);
    public void notifyObservers();
    public T getData();
    public void setStock(int temp);

}

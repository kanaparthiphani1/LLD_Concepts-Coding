package Behavioural.Iterator;

import java.util.List;

public class ListIterator<T> implements Iterator<T>{

    private List<T> lis;
    private int index;

    public ListIterator(List<T> lis) {
        this.lis = lis;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index<lis.size();
    }

    @Override
    public T next() {
        if(hasNext()){
            return lis.get(index++);
        }
        return null;
    }
}

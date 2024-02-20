package Behavioural.Iterator;

import java.util.List;

public class BookStore {
    private List<String> books;

    public BookStore(List<String> books) {
        this.books = books;
    }

    public ListIterator<String> createIterator(){
        return new ListIterator<String>(books);
    }
}

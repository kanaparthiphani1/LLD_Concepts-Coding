package Behavioural.Iterator;

import java.util.List;

public class Client {
    public static void main(String[] args) {
        BookStore bs = new BookStore(List.of("HeadFirstJava","LetUsC","RichDadPoorDad"));
        Iterator<String>  itr = bs.createIterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

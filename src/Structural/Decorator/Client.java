package Structural.Decorator;

public class Client {
    public static void main(String[] args) {
        Pizza piz = new ExtraSpicy(new ExtraCheese( new Margerita()));
        System.out.println(piz.price());

    }
}

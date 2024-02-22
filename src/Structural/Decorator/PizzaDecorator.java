package Structural.Decorator;

public class PizzaDecorator implements Pizza{
    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int price() {
        return pizza.price();
    }
}

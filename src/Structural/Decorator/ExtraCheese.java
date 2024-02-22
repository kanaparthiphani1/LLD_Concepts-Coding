package Structural.Decorator;

public class ExtraCheese extends PizzaDecorator{

    public ExtraCheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int price() {
        return super.price()+5;
    }
}

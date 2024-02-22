package Structural.Decorator;

public class ExtraSpicy extends PizzaDecorator{

    public ExtraSpicy(Pizza pizza) {
        super(pizza);
    }

    @Override
    public int price() {
        return super.price()+3;
    }
}

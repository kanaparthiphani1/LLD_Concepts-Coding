package Creational.AbstractFactory;

public class EconomyFactory implements AbstractFactory{

    @Override
    public Car getInstance(int price) {
        if(price<500000){
            return new SwiftCar();
        }
        return new Altroz();
    }
}

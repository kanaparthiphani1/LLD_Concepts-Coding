package Creational.AbstractFactory;

public class Luxuryfactory implements AbstractFactory{

    @Override
    public Car getInstance(int price) {
        if(price<5000000){
            return new BMW();
        }
        return new Audi();
    }
}

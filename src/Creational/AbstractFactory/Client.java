package Creational.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        Car car = AbstractFactoryProducer.getFactory("ECONOMY").getInstance(450000);
        car.drive();
    }

}

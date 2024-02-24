package Creational.Factory;

public class Client {
    public static void main(String[] args) {
        Car obj = CarFactory.getCar("ECONOMY");
        obj.getCar();
        Car obj2 = CarFactory.getCar("LUXURY");
        obj2.getCar();
    }
}

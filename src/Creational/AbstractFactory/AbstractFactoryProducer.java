package Creational.AbstractFactory;

public class AbstractFactoryProducer {
    public static AbstractFactory getFactory(String type){
        switch (type){
            case "ECONOMY" ->{
                return new EconomyFactory();
            }
            case "LUXURY" -> {
                return new Luxuryfactory();
            }

        }
        return new EconomyFactory();
    }
}

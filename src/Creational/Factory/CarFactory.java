package Creational.Factory;

public class CarFactory {
    public static Car getCar(String carType){
        switch (carType) {
            case "LUXURY" -> {

                return new LuxuryCar();
            }
            case "ECONOMY" -> {
                return new EconomyCar();
            }
        }
        return new EconomyCar();
    }
}

package Structural.Proxy.FlyWeight;

public class Client {
    public static void main(String[] args) {
        IRobot rob1 = RobotResgistry.createRobot("HUMANOID");
        IRobot rob2 = RobotResgistry.createRobot("HUMANOID");
        IRobot rob3 = RobotResgistry.createRobot("DOG");
    }
}

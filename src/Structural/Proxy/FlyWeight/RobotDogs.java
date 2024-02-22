package Structural.Proxy.FlyWeight;

public class RobotDogs implements IRobot{
    private String image;
    private String type;
    private String damage;

    public RobotDogs(String image, String type, String damage) {
        this.image = image;
        this.type = type;
        this.damage = damage;
    }

    public String getImage() {
        return image;
    }

    public String getType() {
        return type;
    }

    public String getDamage() {
        return damage;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying dogs : "+x+ " "+y);
    }
}

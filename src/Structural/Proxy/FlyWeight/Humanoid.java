package Structural.Proxy.FlyWeight;

public class Humanoid implements IRobot{
    private String image;
    private String type;

    public Humanoid(String image, String type) {
        this.image = image;
        this.type = type;
    }

    public String getImage() {
        return image;
    }

    public String getType() {
        return type;
    }

    @Override
    public void display(int x, int y) {
        System.out.println("Displaying in "+x+ " "+y);
    }
}

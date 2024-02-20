package Behavioural.CommandPattern;

public class AirConditioner {
    private boolean isOn;

    public AirConditioner(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

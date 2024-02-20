package Behavioural.CommandPattern.Commands;

import Behavioural.CommandPattern.AirConditioner;

public class TurnOffCommand implements ICommand{

    AirConditioner ac;

    public TurnOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("TurnOff executed");
        ac.setOn(false);
    }

    @Override
    public void undo() {
        System.out.println("Undo turnOff");
        ac.setOn(true);
    }
}

package Behavioural.CommandPattern.Commands;

import Behavioural.CommandPattern.AirConditioner;

public class TurnOnCommand implements ICommand{

    AirConditioner ac;

    public TurnOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        System.out.println("Turn On executed");
        ac.setOn(true);
    }

    @Override
    public void undo() {
        System.out.println("Undo turnOn");
        ac.setOn(false);
    }
}

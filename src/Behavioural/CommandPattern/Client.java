package Behavioural.CommandPattern;

import Behavioural.CommandPattern.Commands.ICommand;
import Behavioural.CommandPattern.Commands.TurnOffCommand;
import Behavioural.CommandPattern.Commands.TurnOnCommand;

public class Client {
    public static void main(String[] args) {
        AirConditioner ac = new AirConditioner(false);
        ICommand cmd = new TurnOnCommand(ac);
        cmd.execute();

        System.out.println("AC STATE : "+ac.isOn());
        ICommand cmd2 = new TurnOffCommand(ac);
        cmd2.execute();

        System.out.println("AC STATE : "+ac.isOn());

        cmd2.undo();
        System.out.println("AC STATE : "+ac.isOn());

    }
}

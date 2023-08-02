package org.pattern.command.initialsol;

import org.pattern.command.initialsol.appliances.BedroomLight;
import org.pattern.command.initialsol.appliances.Light;
import org.pattern.command.initialsol.commands.LightOnCommand;

/*
    This is the CLIENT
 */
public class MainApplication {
    public static void main(String[] args) {
        SimpleRemoteControl remoteControl = new SimpleRemoteControl(); // this is our invoker

        Light light = new BedroomLight(); // this is receiver

        LightOnCommand lightOnCommand = new LightOnCommand(light); // created command object bound with receiver

        remoteControl.setCommand(lightOnCommand); // passing the command to Invoker
        remoteControl.buttonWasPressed();

    }
}

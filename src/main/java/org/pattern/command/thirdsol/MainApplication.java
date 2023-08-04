package org.pattern.command.thirdsol;

import org.pattern.command.thirdsol.appliances.BedroomLight;
import org.pattern.command.thirdsol.appliances.Light;
import org.pattern.command.thirdsol.commands.LightOffCommand;
import org.pattern.command.thirdsol.commands.LightOnCommand;

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

        LightOffCommand lightOffCommand = new LightOffCommand(light);

        remoteControl.setCommand(lightOffCommand);
        remoteControl.buttonWasPressed();

    }
}

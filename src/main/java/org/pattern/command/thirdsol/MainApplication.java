package org.pattern.command.thirdsol;

import org.pattern.command.thirdsol.appliances.*;
import org.pattern.command.thirdsol.commands.LightOffCommand;
import org.pattern.command.thirdsol.commands.LightOnCommand;
import org.pattern.command.thirdsol.commands.NoCommand;
import org.pattern.command.thirdsol.commands.StereoOnWithCDCommand;

/*
    This is the CLIENT
 */
public class MainApplication {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(); // this is our invoker

        Light bedRoomLight = new BedroomLight("Bedroom");
        Light kitchenLight = new KitchenLight("Kitchen");
        Stereo stereo = new StereoWithCD("Bedroom");

        LightOnCommand bedroomLightOnCommand = new LightOnCommand(bedRoomLight);
        LightOffCommand bedroomLightOffCommand = new LightOffCommand(bedRoomLight);

        LightOnCommand kitchenLightOnCommand = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOffCommand = new LightOffCommand(kitchenLight);

        StereoOnWithCDCommand stereoOnCommand = new StereoOnWithCDCommand(stereo);


        remoteControl.setCommand(0, bedroomLightOnCommand, bedroomLightOffCommand);
        remoteControl.setCommand(1, kitchenLightOnCommand, kitchenLightOffCommand);
        remoteControl.setCommand(2, stereoOnCommand, new NoCommand()); // NoCommand is a placeholder for StereoOffCommand

        System.out.println(remoteControl);



        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
    }
}

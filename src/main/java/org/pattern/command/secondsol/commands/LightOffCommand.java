package org.pattern.command.secondsol.commands;


import org.pattern.command.secondsol.appliances.Light;

public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}

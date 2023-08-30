package org.pattern.command.initialsol.commands;

import org.pattern.command.initialsol.appliances.Light;

public class LightOffCommand implements Command{

    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        this.light.off();
    }
}

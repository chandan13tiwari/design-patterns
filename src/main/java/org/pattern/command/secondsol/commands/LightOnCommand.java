package org.pattern.command.secondsol.commands;

import org.pattern.command.secondsol.appliances.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}

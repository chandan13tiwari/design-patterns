package org.pattern.command.thirdsol.commands;

import org.pattern.command.thirdsol.appliances.Light;

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

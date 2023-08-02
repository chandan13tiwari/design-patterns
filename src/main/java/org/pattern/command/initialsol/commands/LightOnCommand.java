package org.pattern.command.initialsol.commands;

import org.pattern.command.initialsol.appliances.Light;
import org.pattern.command.initialsol.commands.Command;

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

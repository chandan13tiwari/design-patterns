package org.pattern.command.initialsol;

import org.pattern.command.initialsol.commands.Command;

/*
    This is the INVOKER
 */
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}

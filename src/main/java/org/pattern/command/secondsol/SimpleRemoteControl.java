package org.pattern.command.secondsol;

import org.pattern.command.secondsol.commands.Command;

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

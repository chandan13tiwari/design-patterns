package org.pattern.command.finalsol.commands;

// NoCommand command to avoid NullPointerException
public class NoCommand implements Command {
    @Override
    public void execute() {
        // do nothing
    }

    @Override
    public void undo() {
        // do nothing
    }
}

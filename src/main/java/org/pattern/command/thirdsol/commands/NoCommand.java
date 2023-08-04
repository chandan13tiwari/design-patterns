package org.pattern.command.thirdsol.commands;

// NoCommand command to avoid NullPointerException
public class NoCommand implements Command{
    @Override
    public void execute() {
        // do nothing
    }
}

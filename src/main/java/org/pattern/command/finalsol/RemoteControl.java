package org.pattern.command.finalsol;

import org.pattern.command.finalsol.commands.Command;
import org.pattern.command.finalsol.commands.NoCommand;

/*
    This is the INVOKER
 */
public class RemoteControl {
    //Command command;  // instead of creating of single command, we will now create a Command[] to store commands for all appliances
    Command[] onCommands;
    Command[] offCommands;

    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];  // According to the requirement we have 7 appliances, so 7 commands for ON and 7 for OFF
        offCommands = new Command[7];

        Command noCommand = new NoCommand();

        for(int i=0; i<7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand; // initially UNDO button will not do anything
    }

    // it takes a slot position and an On and Off command to be stored in that slot
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }


    public void onButtonWasPressed(int slot) {
        this.onCommands[slot].execute();
        undoCommand = onCommands[slot]; // saving the reference when ON Command pressed
    }

    public void offButtonWasPressed(int slot) {
        this.offCommands[slot].execute();
        undoCommand = offCommands[slot]; // saving the reference when OFF Command pressed
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();
    }


    // Overriding toString() method
    public String toString() {
        StringBuffer string = new StringBuffer();

        string.append("\n----- REMOTE CONTROL -----\n");

        for(int i=0; i< onCommands.length; i++) {
            string.append("[slot " + i + "] " + onCommands[i].getClass().getName().split("\\.")[5] + "   " + offCommands[i].getClass().getName().split("\\.")[5] + "\n");
        }

        string.append("[undo] " + undoCommand.getClass().getName().split("\\.")[5]);

        return string.toString();
    }
}

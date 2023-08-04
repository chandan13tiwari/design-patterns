package org.pattern.command.thirdsol.commands;

import org.pattern.command.thirdsol.appliances.Stereo;
import org.pattern.command.thirdsol.appliances.StereoWithCD;

public class StereoOnWithCDCommand implements Command{

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}

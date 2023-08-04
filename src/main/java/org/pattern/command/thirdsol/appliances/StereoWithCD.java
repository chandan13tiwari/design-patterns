package org.pattern.command.thirdsol.appliances;

public class StereoWithCD implements Stereo{
    @Override
    public void on() {
        System.out.println("Stereo is ON");
    }

    @Override
    public void off() {
        System.out.println("Stereo is OFF");
    }

    @Override
    public void setCD() {
        System.out.println("Stereo is set with CD");
    }

    @Override
    public void setDVD() {
        // do nothing
    }

    @Override
    public void setRadio() {
        // do nothing
    }

    @Override
    public void setVolume(int volume) {
        System.out.println("Volume is set to " + volume);
    }
}

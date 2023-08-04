package org.pattern.command.finalsol.appliances;

public class StereoWithCD implements Stereo {

    String location;

    public StereoWithCD(String location) {
        this.location = location;
    }

    @Override
    public void on() {
        System.out.println(this.location + " Stereo is ON");
    }

    @Override
    public void off() {
        System.out.println(this.location + " Stereo is OFF");
    }

    @Override
    public void setCD() {
        System.out.println(this.location + " Stereo is set with CD");
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
        System.out.println(this.location + " Stereo Volume is set to " + volume);
    }
}

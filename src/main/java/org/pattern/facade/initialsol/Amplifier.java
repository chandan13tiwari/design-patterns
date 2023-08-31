package org.pattern.facade.initialsol;

public class Amplifier {
    public Tuner tuner;
    public StreamingPlayer player;

    public Amplifier() {}

    public Amplifier(Tuner tuner, StreamingPlayer player) {
        this.tuner = tuner;
        this.player = player;
    }

    public void on() {
        System.out.println("Amplifier ON");
    }

    public void off() {
        System.out.println("Amplifier OFF");
    }

    public void setStreamingPlayer(StreamingPlayer player) {
        this.player = player;
    }

    public void setStereoSound() {
        System.out.println("Stereo Sound ON");
    }

    public void setSurroundSound() {
        System.out.println("Surrround Sound ON");
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setVolume(int volume) {
        System.out.println("Volume is set to " + volume);
    }
}

package org.pattern.facade.finalsol;

public class StreamingPlayer {
    public Amplifier amplifier;

    public StreamingPlayer() {}
    public StreamingPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Streaming Player ON");
    }

    public void off() {
        System.out.println("Streaming Player OFF");
    }

    public void play(String movie) {
        System.out.println("Streaming Player started Playing - " + movie);
    }

    public void pause() {
        System.out.println("Streaming Player is Paused");
    }

    public void stop() {
        System.out.println("Streaming Player is Stopped");
    }
    public void setSurroundAudio() {

    }

    public void setTwoChannelAudio() {

    }

}

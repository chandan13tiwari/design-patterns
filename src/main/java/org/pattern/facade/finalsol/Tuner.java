package org.pattern.facade.finalsol;

public class Tuner {
    public Amplifier amplifier;

    public Tuner() {}

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Tuner is ON");
    }

    public void off() {
        System.out.println("Tuner is OFF");
    }

    public void setAm() {
        System.out.println("Tuner is set to AM");
    }

    public void setFm() {
        System.out.println("Tuner is set to FM");
    }

    public void setFrequency(double frequency) {
        System.out.println("Tuner Frequency is set to " + frequency);
    }
}

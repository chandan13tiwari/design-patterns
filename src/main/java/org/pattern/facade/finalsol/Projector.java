package org.pattern.facade.finalsol;

public class Projector {
    public StreamingPlayer player;

    public Projector(StreamingPlayer player) {
        this.player = player;
    }

    public void on() {
        System.out.println("Projector is ON");
    }

    public void off() {
        System.out.println("Projector is OFF");
    }

    public void tvMode() {
        System.out.println("Projector is set to TV Mode");
    }

    public void wideScreenMode() {
        System.out.println("Projector is set to Wide Screen Mode");
    }
}

package org.pattern.facade.initialsol;

public class HomeTheaterApplication {
    public static void main(String[] args) {
        StreamingPlayer player = new StreamingPlayer();
        Tuner tuner = new Tuner();
        Amplifier amplifier = new Amplifier(tuner, player);
        PopcornPopper popper = new PopcornPopper();
        Projector projector = new Projector(player);
        Screen screen = new Screen();
        TheaterLight theaterLight = new TheaterLight();

        // preparing Popcorn
        popper.on();
        popper.pop();

        // Dim Theater lights
        theaterLight.dim();

        // Screen rolled down
        screen.down();

        // Setting up projector
        projector.on();
        projector.wideScreenMode();

        // Setting up Amplifier
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        // Start player
        player.on();
        player.play("Barbie");


        // Again call all methods to close the setup
        // WHAT A MESSSSS....
    }
}

package org.pattern.facade.finalsol;

public class HomeTheaterFacade {
    public Amplifier amplifier;
    public PopcornPopper popper;
    public Projector projector;
    public Screen screen;
    public StreamingPlayer player;
    public TheaterLight theaterLight;
    public Tuner tuner;

    public HomeTheaterFacade(Amplifier amplifier, PopcornPopper popper, Projector projector, Screen screen, StreamingPlayer player, TheaterLight theaterLight, Tuner tuner) {
        this.amplifier = amplifier;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.player = player;
        this.theaterLight = theaterLight;
        this.tuner = tuner;
    }

    // performing ON operation within one interface
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch Movie...");

        popper.on();
        popper.pop();
        theaterLight.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setStreamingPlayer(player);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        player.on();
        player.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting Movie Theater down...");

        popper.off();
        theaterLight.on();
        screen.up();
        projector.off();
        amplifier.off();
        player.stop();
        player.off();
    }
}

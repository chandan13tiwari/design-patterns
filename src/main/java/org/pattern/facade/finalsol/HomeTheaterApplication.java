package org.pattern.facade.finalsol;

public class HomeTheaterApplication {
    public static void main(String[] args) {
        StreamingPlayer player = new StreamingPlayer();
        Tuner tuner = new Tuner();
        Amplifier amplifier = new Amplifier(tuner, player);
        PopcornPopper popper = new PopcornPopper();
        Projector projector = new Projector(player);
        Screen screen = new Screen();
        TheaterLight theaterLight = new TheaterLight();


        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, popper, projector, screen, player, theaterLight, tuner);

        // Start watching movie
        homeTheater.watchMovie("Barbie");

        // Movie Ended
        homeTheater.endMovie();
    }
}

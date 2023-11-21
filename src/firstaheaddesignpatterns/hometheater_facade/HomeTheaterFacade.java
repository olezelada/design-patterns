package firstaheaddesignpatterns.hometheater_facade;

public class HomeTheaterFacade {

    Tuner tuner;
    Screen screen;
    CdPlayer cd;
    Amplifier amplifier;
    DvdPlayer dvd;
    Projector projector;
    TheaterLights lights;
    PopcornPopper popper;

    public HomeTheaterFacade(
            Amplifier amp,
            Tuner tuner,
            DvdPlayer dvdPlayer,
            CdPlayer cdPlayer,
            Projector projector,
            Screen screen,
            TheaterLights lights,
            PopcornPopper popper
    ) {
        this.amplifier = amp;
        this.tuner = tuner;
        this.dvd = dvdPlayer;
        this.cd = cdPlayer;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie){
        System.out.println("Get Ready to watch a movie...");

        popper.on();
        popper.pop();

        lights.dim(10);

        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);

        dvd.on();
        dvd.play(movie);
    }

    public void endMovie(){
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.off();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}

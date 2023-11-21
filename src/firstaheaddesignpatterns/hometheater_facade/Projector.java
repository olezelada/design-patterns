package firstaheaddesignpatterns.hometheater_facade;

public class Projector {

    DvdPlayer dvdPlayer;

    public void on(){
        System.out.println("ON was executed on Projector");
    }

    public void off(){
        System.out.println("OFF was executed on Projector");
    }

    public void wideScreenMode(){
        System.out.println("WIDE_SCREEN_MODE was executed on Projector");
    }

    public void tvMode(){
        System.out.println("TV_MODE was executed on Projector");
    }
}

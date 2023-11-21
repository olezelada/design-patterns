package firstaheaddesignpatterns.hometheater_facade;

public class CdPlayer {

    Amplifier amplifier;

    public void on(){
        System.out.println("ON was executed on CdPlayer");
    }

    public void off(){
        System.out.println("OFF was executed on CdPlayer");
    }

    public void eject(){
        System.out.println("EJECT was executed on CdPlayer");
    }

    public void pause(){
        System.out.println("PAUSE was executed on CdPlayer");
    }

    public void play(){
        System.out.println("PLAY was executed on CdPlayer");
    }

    public void stop(){
        System.out.println("STOP was executed on CdPlayer");
    }
}

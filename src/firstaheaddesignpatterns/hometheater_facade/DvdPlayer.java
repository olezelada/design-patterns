package firstaheaddesignpatterns.hometheater_facade;

public class DvdPlayer {
    Amplifier amplifier;

    public void on(){
        System.out.println("ON was executed on DvdPlayer");
    }

    public void off(){
        System.out.println("OFF was executed on DvdPlayer");
    }

    public void eject(){
        System.out.println("EJECT was executed on DvdPlayer");
    }

    public void pause(){
        System.out.println("PAUSE was executed on DvdPlayer");
    }

    public void play(String dvd){
        System.out.println("PLAY was executed on DvdPlayer to "+dvd);
    }

    public void stop(){
        System.out.println("STOP was executed on DvdPlayer");
    }

    public void setTwoChannelAudio(){
        System.out.println("SET_TWO_CHANNEL_AUDIO was executed on DvdPlayer");
    }

    public void setSurroundAudio(){
        System.out.println("SET_SURROUND_AUDIO was executed on DvdPlayer");
    }
}

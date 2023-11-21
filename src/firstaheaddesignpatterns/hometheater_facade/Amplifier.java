package firstaheaddesignpatterns.hometheater_facade;

public class Amplifier {

    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on(){
        System.out.println("ON was executed on Amplifier");
    }

    public void off(){
        System.out.println("OFF was executed on Amplifier");
    }

    public void setCd(){
        System.out.println("SET_CD was executed on Amplifier");
    }

    public void setDvd(DvdPlayer dvd){
        System.out.println("SET_DVD was executed on Amplifier to "+dvd.toString());
    }

    public void setStereoSound(){
        System.out.println("SET_STEREO_SOUND was executed on Amplifier");
    }

    public void setSurroundSound(){
        System.out.println("SET_SURROUND_SOUND was executed on Amplifier");
    }

    public void setTuner(){
        System.out.println("SET_TUNER was executed on Amplifier");
    }

    public void setVolume(int volume){
        System.out.println("SET_VOLUME was executed on Amplifier to change to "+volume);
    }
}

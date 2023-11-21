package firstaheaddesignpatterns.hometheater_facade;

public class TheaterLights {

    public void on(){
        System.out.println("ON was executed on TheaterLights");
    }

    public void off(){
        System.out.println("OFF was executed on TheaterLights");
    }

    public void dim(int dim){
        System.out.println("DIM was executed on TheaterLights to "+dim);
    }
}

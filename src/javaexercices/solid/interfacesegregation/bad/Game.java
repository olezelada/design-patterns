package javaexercices.solid.interfacesegregation.bad;

public class Game implements IProduct {

    private static final String TYPE = "GAME";

    private int age = 0;

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getAge() {
        return age;
    }
}

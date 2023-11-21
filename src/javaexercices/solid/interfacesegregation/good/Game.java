package javaexercices.solid.interfacesegregation.good;

public class Game implements Product, ProductRestricted{

    private static final String TYPE = "Game";

    private int age;

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getAge() {
        return this.age;
    }
}

package javaexercices.solid.interfacesegregation.good;

public class Shoe implements Product{

    private static final String TYPE = "Shoe";

    @Override
    public String getType() {
        return TYPE;
    }
}

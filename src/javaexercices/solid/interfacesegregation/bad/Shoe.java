package javaexercices.solid.interfacesegregation.bad;

public class Shoe implements IProduct {

    private static final String TYPE = "Shoe";

    @Override
    public String getType() {
        return TYPE;
    }

    @Override
    public int getAge() {
        throw new UnsupportedOperationException("");
    }
}

package firstaheaddesignpatterns.decoratorstarbuzz;

public abstract class Beverage {

    private static final String UNKNOW = "Unknown Beverage";

    String description = UNKNOW;

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

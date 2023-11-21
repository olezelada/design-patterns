package firstaheaddesignpatterns.decoratorstarbuzz;

public class Decaf extends Beverage {

    private static final String DECAF_DESCRIPTION = "Decaf Coffee";

    private static final double DECAF_COST = 1.05;

    public Decaf(){
        description = DECAF_DESCRIPTION;
    }

    @Override
    public double cost() {
        return DECAF_COST;
    }
}

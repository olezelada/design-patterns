package firstaheaddesignpatterns.decoratorstarbuzz;

public class Espresso extends Beverage {

    private static final String ESPRESSO_DESCRIPTION = "Espresso Coffee";

    private static final double ESPRESSO_COST = 1.99;

    public Espresso(){
        description = ESPRESSO_DESCRIPTION;
    }

    @Override
    public double cost() {
        return ESPRESSO_COST;
    }
}

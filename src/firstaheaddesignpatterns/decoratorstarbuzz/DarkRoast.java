package firstaheaddesignpatterns.decoratorstarbuzz;

public class DarkRoast extends Beverage {

    private static final String DARK_DESCRIPTION = "Dark Roast Coffee";

    private static final double DARK_COST = 0.99;

    public DarkRoast(){
        description = DARK_DESCRIPTION;
    }

    @Override
    public double cost() {
        return DARK_COST;
    }
}

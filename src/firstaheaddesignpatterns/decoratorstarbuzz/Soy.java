package firstaheaddesignpatterns.decoratorstarbuzz;

public class Soy extends CondimentDecorator {

    private static final String SOY_DESCRIPTION = ", Soy";

    private static final double SOY_COST = 0.15;

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(SOY_DESCRIPTION);
    }

    @Override
    public double cost() {
        return  SOY_COST + beverage.cost();
    }
}

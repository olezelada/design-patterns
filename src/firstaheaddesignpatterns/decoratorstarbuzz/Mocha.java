package firstaheaddesignpatterns.decoratorstarbuzz;

public class Mocha extends CondimentDecorator {

    private static final String MOCHA_DESCRIPTION = ", Mocha";

    private static final double MOCHA_COST = 0.20;

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(MOCHA_DESCRIPTION);
    }

    @Override
    public double cost() {
        return MOCHA_COST + beverage.cost();
    }
}



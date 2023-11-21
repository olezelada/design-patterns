package firstaheaddesignpatterns.decoratorstarbuzz;

public class Whip extends CondimentDecorator {

    private static final String WHIP_DESCRIPTION = ", Whip";

    private static final double WHIP_COST = 0.10;

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(WHIP_DESCRIPTION);
    }

    @Override
    public double cost() {
        return WHIP_COST + beverage.cost();
    }
}

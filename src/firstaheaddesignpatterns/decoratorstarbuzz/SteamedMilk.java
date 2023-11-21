package firstaheaddesignpatterns.decoratorstarbuzz;

public class SteamedMilk extends CondimentDecorator {

    private static final String STEAMED_MILK_DESC = ", steamed milk";

    private static final double STEAMED_MILK_COST = 0.10;

    private Beverage beverage;

    public SteamedMilk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription().concat(STEAMED_MILK_DESC);
    }

    @Override
    public double cost() {
        return STEAMED_MILK_COST + beverage.cost();
    }
}

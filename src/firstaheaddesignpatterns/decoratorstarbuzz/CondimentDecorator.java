package firstaheaddesignpatterns.decoratorstarbuzz;

public abstract class CondimentDecorator extends Beverage {

    private static final double NO_COST = 0;

    public abstract String getDescription();

    @Override
    public double cost() {
        return NO_COST;
    }
}

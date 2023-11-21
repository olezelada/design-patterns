package firstaheaddesignpatterns.decoratorstarbuzz;

public class HouseBlend extends Beverage {

    private static final String HOUSE_BLEND_DESCRIPTION = "House Blend Coffee";

    private static final double HOUSE_BLEND_COST = 0.89;

    public HouseBlend() {
        description = HOUSE_BLEND_DESCRIPTION;
    }

    @Override
    public double cost() {
        return HOUSE_BLEND_COST;
    }
}

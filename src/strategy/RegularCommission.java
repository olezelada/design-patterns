package strategy;

/**
 * @author: Olegario Zelada
 */
public class RegularCommission implements CommissionStrategy {

    private static final Double REGULAR_COMMISSION = 0.10;

    @Override
    public Double applyCommission(Double amount) {
        return amount * REGULAR_COMMISSION;
    }
}

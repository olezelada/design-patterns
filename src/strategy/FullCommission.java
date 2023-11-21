package strategy;

/**
 * @author: Olegario Zelada
 */
public class FullCommission implements CommissionStrategy {

    private static final Double FULL_COMMISSION = 0.50;

    @Override
    public Double applyCommission(Double amount) {
        return amount * FULL_COMMISSION;
    }
}

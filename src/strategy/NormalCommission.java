package strategy;

/**
 * @author: Olegario Zelada
 */
public class NormalCommission implements CommissionStrategy {

    private static final Double NORMAL_COMMISSION = 0.30;

    @Override
    public Double applyCommission(Double amount) {
        return amount * NORMAL_COMMISSION;
    }
}

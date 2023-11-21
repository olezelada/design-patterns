package strategy;

/**
 * @author: Olegario Zelada
 */
public class Context {

    private CommissionStrategy commissionStrategy;

    public Context(CommissionStrategy commissionStrategy) {
        this.commissionStrategy = commissionStrategy;
    }

    public Double executeStrategy(Double amount) {
        return commissionStrategy.applyCommission(amount);
    }
}

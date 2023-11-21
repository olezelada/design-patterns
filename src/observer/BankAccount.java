package observer;

import java.util.Observable;

/**
 * @author: Olegario Zelada
 */
public class BankAccount extends Observable {

    private double balance;

    public void addAmount(Double amount){
        this.balance = this.balance + amount;
        setChanged();
        notifyObservers(balance);
    }

    public Double getBalance() {
        return balance;
    }
}

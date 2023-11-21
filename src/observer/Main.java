package observer;

/**
 * @author: Olegario Zelada
 */
public class Main {

    public static void main(String[] args){

        //Observable class
        BankAccount bankAccount = new BankAccount();

        //Observer class
        BankExpense bankExpenseOne = new BankExpense("commision",0.11d);
        BankExpense bankExpenseTwo = new BankExpense("expense",0.22d);
        BankExpense bankExpenseThree = new BankExpense("compesantion",0.33d);

        //add Observer into Observable
        bankAccount.addObserver(bankExpenseOne);
        bankAccount.addObserver(bankExpenseTwo);
        bankAccount.addObserver(bankExpenseThree);

        //change Observable state
        bankAccount.addAmount(1000d);

        //Observer was notified
        System.out.println(bankExpenseOne.toString());
        System.out.println(bankExpenseTwo.toString());
        System.out.println(bankExpenseThree.toString());

        bankAccount.addAmount(10d);

        //Observer was notified
        System.out.println(bankExpenseOne.toString());
        System.out.println(bankExpenseTwo.toString());
        System.out.println(bankExpenseThree.toString());

    }
}

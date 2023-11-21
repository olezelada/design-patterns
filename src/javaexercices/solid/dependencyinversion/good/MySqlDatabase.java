package javaexercices.solid.dependencyinversion.good;

import javaexercices.solid.dependencyinversion.PaymentType;
import javaexercices.solid.dependencyinversion.Product;

public class MySqlDatabase implements Persistence {
    @Override
    public void save(Product product, PaymentType paymentType) {
        System.out.println("Save product "+ product + "paymentType "+paymentType);
        // save into MySqlDatabase ...
    }
}

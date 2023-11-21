package javaexercices.solid.dependencyinversion.bad;

import javaexercices.solid.dependencyinversion.PaymentType;
import javaexercices.solid.dependencyinversion.Product;

public class MySqlDatabase {
    void save(Product product, PaymentType paymentType) {
        System.out.println("Save product " + product + " paymentType " + paymentType);
        // save into MySqlDatabase...
    }
}

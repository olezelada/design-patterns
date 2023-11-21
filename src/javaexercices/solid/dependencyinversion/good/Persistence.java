package javaexercices.solid.dependencyinversion.good;

import javaexercices.solid.dependencyinversion.PaymentType;
import javaexercices.solid.dependencyinversion.Product;

public interface Persistence {
    void save(Product product, PaymentType paymentType);
}

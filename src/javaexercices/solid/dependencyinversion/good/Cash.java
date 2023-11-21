package javaexercices.solid.dependencyinversion.good;

import javaexercices.solid.dependencyinversion.PaymentType;
import javaexercices.solid.dependencyinversion.Product;

public class Cash {
    Persistence persistence;

    public Cash(Persistence persistence){
        this.persistence = persistence;
    }

    public void pay(Product product, PaymentType paymentType){
        persistence.save(product, paymentType);
    }
}

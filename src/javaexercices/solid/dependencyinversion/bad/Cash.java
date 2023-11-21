package javaexercices.solid.dependencyinversion.bad;

import javaexercices.solid.dependencyinversion.PaymentType;
import javaexercices.solid.dependencyinversion.Product;

public class Cash {
    public void pay(Product product, PaymentType paymentType){
        MySqlDatabase persistence = new MySqlDatabase();
        persistence.save(product, paymentType);
    }
}

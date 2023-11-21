package firstaheaddesignpatterns.factoryPizza.newyork;

import firstaheaddesignpatterns.factoryPizza.*;
import firstaheaddesignpatterns.factoryPizza.ingredients.PizzaIngredientFactory;

public class NYStylePizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (CHEESE.equals(item)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (VEGGIE.equals(item)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (CLAM.equals(item)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (PEPERONI.equals(item)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}

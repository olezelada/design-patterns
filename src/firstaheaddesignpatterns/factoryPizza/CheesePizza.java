package firstaheaddesignpatterns.factoryPizza;

import firstaheaddesignpatterns.factoryPizza.ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing "+name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

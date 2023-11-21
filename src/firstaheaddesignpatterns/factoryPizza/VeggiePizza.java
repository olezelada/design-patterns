package firstaheaddesignpatterns.factoryPizza;

import firstaheaddesignpatterns.factoryPizza.ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory){
        this.ingredientFactory = pizzaIngredientFactory;
    }

    @Override
    protected void prepare() {

        System.out.println("Preparing "+name);
        dough = ingredientFactory.createDough();
        cheese = ingredientFactory.createCheese();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClam();

    }
}

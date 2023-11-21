package firstaheaddesignpatterns.factoryPizza;

public abstract class PizzaStore {

    protected static final String CHEESE = "cheese";
    protected static final String PEPERONI = "peperoni";
    protected static final String CLAM = "clam";
    protected static final String VEGGIE = "veggie";

    public Pizza orderPizza(String type){

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;

    }

    protected abstract Pizza createPizza(String type);

}

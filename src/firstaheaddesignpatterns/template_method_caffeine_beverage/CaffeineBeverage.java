package firstaheaddesignpatterns.template_method_caffeine_beverage;

public abstract class CaffeineBeverage {

    final void prepareRecipe(){
        boilWater();

        brew();

        pourInCup();

        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    protected void boilWater(){
        System.out.println("Boiling water !!!");
    }

    protected void pourInCup(){
        System.out.println("Pouring into  cup !!!");
    }

}

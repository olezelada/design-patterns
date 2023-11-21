package firstaheaddesignpatterns.template_method_caffeine_beverage;

public abstract class CaffeineBeverageWithHook {

    void prepareRecipe(){
        boilWater();

        brew();

        pourInCup();
        if(customerWantsCondiments()){
            addCondiments();
        }

    }

    abstract void brew();

    abstract void addCondiments();

    protected void boilWater(){
        System.out.println("Boiling water !!!");
    }

    protected void pourInCup(){
        System.out.println("Pouring into  cup !!!");
    }

    boolean customerWantsCondiments(){
        return true;
    }
}

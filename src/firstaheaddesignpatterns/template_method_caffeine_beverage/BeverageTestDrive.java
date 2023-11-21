package firstaheaddesignpatterns.template_method_caffeine_beverage;

public class BeverageTestDrive {

    public static void main(String[] args){
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();
        TeaWithHook teaWithHook = new TeaWithHook();

        System.out.println("\n Making coffee...");
        coffeeWithHook.prepareRecipe();

        System.out.println("\n Making tea...");
        teaWithHook.prepareRecipe();

    }
}

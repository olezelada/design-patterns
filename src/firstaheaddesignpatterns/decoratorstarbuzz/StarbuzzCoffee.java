package firstaheaddesignpatterns.decoratorstarbuzz;

public class StarbuzzCoffee {

    public static void main(String arg[]){

        final String LINE = "---------------------------";

        Beverage houseBlend = new HouseBlend();
        Beverage darkRoast = new DarkRoast();
        Beverage decaf = new Decaf();
        Beverage espresso = new Espresso();

        /*
        * TODO: remove Syso staments it is only demostrative case.
        * */
        print(houseBlend);
        System.out.println(LINE);
        print(darkRoast);
        System.out.println(LINE);
        print(decaf);
        System.out.println(LINE);
        print(espresso);

        /*
         * TODO: remove Syso staments it is only demostrative case.
         *  The first Customer wants a Dark Roast with whip and Mocha
        * */

        System.out.println("\n************ Starbuzz Orders *****************");
        System.out.println("------------- Customer 1 ------------- ");
        print(new Whip(new Mocha(darkRoast)));

        System.out.println("------------- Customer 2 ------------- ");
        print(new Mocha(new Mocha(espresso)));
        System.out.println("************ Starbuzz Orders *****************");

    }

    private static void print(Beverage beverage){
        System.out.println(beverage.getDescription().concat(". -> $") + beverage.cost());
    }

}

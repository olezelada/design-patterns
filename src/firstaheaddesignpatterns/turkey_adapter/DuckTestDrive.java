package firstaheaddesignpatterns.turkey_adapter;

public class DuckTestDrive {

    public static void main(String[] args) {

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says ..............");
        testTurkey(turkey);
        System.out.println("\n");

        System.out.println("The Duck says ................");
        testDuck(duck);
        System.out.println("\n");

        System.out.println("The TurkeyAdapter says .......");
        testDuck(turkeyAdapter);
        System.out.println("\n");
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    private static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}

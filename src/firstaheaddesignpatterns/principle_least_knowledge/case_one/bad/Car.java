package firstaheaddesignpatterns.principle_least_knowledge.case_one.bad;

public class Car {
    private CarEngine engine;

    public Car() {
        this.engine = new CarEngine();
    }

    public void displayEnginePrice() {
        double enginePrice = engine.getPrice(); // Car conoce detalles internos del Engine
        System.out.println("Engine price: " + enginePrice);
    }
}

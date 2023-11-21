package firstaheaddesignpatterns.principle_least_knowledge.case_one.correct;



public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void displayEnginePrice() {
        double enginePrice = engine.getPrice(); // Car no conoce detalles internos del Engine
        System.out.println("Engine price: " + enginePrice);
    }
}

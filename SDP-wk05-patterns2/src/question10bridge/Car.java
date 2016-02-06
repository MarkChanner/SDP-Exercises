package question10bridge;

/**
 * SDP Design Patterns II
 * Question 10 - Bridge Pattern
 * Mark Channer
 */
public abstract class Car {

    private Product system;
    private String carDescription;

    public Car(Product system, String carDescription) {
        this.system = system;
        this.carDescription = carDescription;
    }

    public void produceProduct() {
        system.produce();
        system.modify(carDescription);
    }

    public void assemble() {
        system.assemble(carDescription);
    }

    public void printDetails() {
        system.showDetails(carDescription);
    }

}
package question10bridge;

/**
 * SDP Design Patterns II
 * Question 10 - Bridge Pattern
 * Mark Channer
 */
public abstract class Product {

    private String systemDescription;

    public Product(String systemDescription) {
        this.systemDescription = systemDescription;
    }

    public void produce() {
        System.out.println("Producing " + systemDescription);
    }

    public void modify(String carDescription) {
        System.out.println("Modifying product " + systemDescription +
                " according to " + carDescription);
    }

    public void assemble(String carDescription) {
        System.out.println("Assembling " + systemDescription +
                " for " + carDescription);
    }

    public void showDetails(String carDescription) {
        System.out.println("Car: " + carDescription +
                ", Product: " + systemDescription);

    }

}

package question06builder;

/**
 * SDP Design Patterns II
 * Question 6 - Builder Pattern
 * Mark Channer
 */
public class CarDirector {

    private CarBuilder builder;

    public CarDirector(CarBuilder builder) {
        this.builder = builder;
    }

    public void build() {
        builder.makeCarType();
        builder.makeBody();
        builder.makeBreaks();
        builder.makeEngine();
        builder.makeFuelType();
        builder.makePower();
        builder.makeSeats();
        builder.makeWindows();
    }

}

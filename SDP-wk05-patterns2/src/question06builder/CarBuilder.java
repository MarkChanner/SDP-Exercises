package question06builder;

/**
 * SDP Design Patterns II
 * Question 6 - Builder Pattern
 * Mark Channer
 */
public interface CarBuilder {

    void makeBody();

    void makePower();

    void makeEngine();

    void makeBreaks();

    void makeSeats();

    void makeWindows();

    void makeFuelType();

    void makeCarType();

    Car getCar();

}

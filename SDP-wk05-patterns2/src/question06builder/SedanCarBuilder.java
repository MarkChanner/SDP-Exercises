package question06builder;

/**
 * SDP Design Patterns II
 * Question 6 - Builder Pattern
 * Mark Channer
 */
public class SedanCarBuilder implements CarBuilder {

    private Car car;

    @Override
    public void makeCarType() {
        car = new Car("SEDAN");
    }

    @Override
    public void makeBody() {

    }

    @Override
    public void makePower() {

    }

    @Override
    public void makeEngine() {

    }

    @Override
    public void makeBreaks() {

    }

    @Override
    public void makeSeats() {

    }

    @Override
    public void makeWindows() {

    }

    @Override
    public void makeFuelType() {

    }

    @Override
    public Car getCar() {
        return null;
    }

}

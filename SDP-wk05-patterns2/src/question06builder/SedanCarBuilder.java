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
        car.setBodyStyle("External dimensions: overall length (inches:) 202.9,\n" +
                "overall width (inches): 76.2, overall height (inches): 60.7,\n" +
                "wheelbase (inches): 112.0, front track (inches): 65.3,\n" +
                "rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5");
    }

    @Override
    public void makePower() {
        car.setPower("285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm");
    }

    @Override
    public void makeEngine() {
        car.setEngine("3.5L Duramax V 6 DOHC");
    }

    @Override
    public void makeBreaks() {
        car.setBreaks("Four-wheel disc brakes: two ventilate. Electronic brake distribution");
    }

    @Override
    public void makeSeats() {
        car.setSeats("Front seat centre armrest. Rear seat centre armrest. Split-folding rear seats");
    }

    @Override
    public void makeWindows() {
        car.setWindows("Laminated side windows. Fixed rear window with defroster");
    }

    @Override
    public void makeFuelType() {
        car.setFuelType("Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range");
    }

    @Override
    public Car getCar() {
        return car;
    }

}

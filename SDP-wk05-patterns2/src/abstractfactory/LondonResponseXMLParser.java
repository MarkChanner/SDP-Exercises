package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class LondonResponseXMLParser implements XMLParser {

    @Override
    public String parse() {
        String message = "London Parsing response XML...\n" +
                "London Response XML Message";
        return message;
    }
}

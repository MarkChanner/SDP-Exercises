package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class LondonErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        String message = "London Parsing error XML...\n" +
                "London Error XML Message";
        return message;
    }
}

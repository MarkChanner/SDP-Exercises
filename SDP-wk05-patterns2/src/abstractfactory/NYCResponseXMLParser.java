package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class NYCResponseXMLParser implements XMLParser {

    @Override
    public String parse() {
        String message = "NYC Parsing response XML...\n" +
                "NYC response XML Message";
        return message;
    }
}

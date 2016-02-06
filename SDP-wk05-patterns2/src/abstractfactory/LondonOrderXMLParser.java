package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class LondonOrderXMLParser implements XMLParser {

    @Override
    public String parse() {
        String message = "London Parsing order XML...\n" +
                "London Order XML Message";
        return message;
    }
}

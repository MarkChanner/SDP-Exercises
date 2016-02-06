package question04abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class NYCOrderXMLParser implements XMLParser {

    @Override
    public String parse() {
        String message = "NYC Parsing order XML...\n" +
                "NYC Order XML Message";
        return message;
    }
}

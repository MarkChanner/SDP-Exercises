package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class NYCErrorXMLParser implements XMLParser {

    @Override
    public String parse() {
        String message = "NYC Parsing error XML...\n" +
                "NYC Error XML Message";
        return message;
    }
}

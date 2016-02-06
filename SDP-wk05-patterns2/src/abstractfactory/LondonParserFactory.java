package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class LondonParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {
        XMLParser parser = null;
        if (parserType.toLowerCase().equals("londonerror")) {
            parser = new LondonErrorXMLParser();
        } else if (parserType.toLowerCase().equals("londonfeedback")) {
            parser = new LondonFeedbackXMLParser();
        } else if (parserType.toLowerCase().equals("londonorder")) {
            parser = new LondonErrorXMLParser();
        } else if (parserType.toLowerCase().equals("londonresponse")) {
            parser = new LondonResponseXMLParser();
        }
        return parser;
    }
}

package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class NYCParserFactory implements AbstractParserFactory {

    @Override
    public XMLParser getParserInstance(String parserType) {
        XMLParser parser = null;
        if (parserType.toLowerCase().equals("nycerror")) {
            parser = new NYCErrorXMLParser();
        } else if (parserType.toLowerCase().equals("nycfeedback")) {
            parser = new NYCFeedbackXML();
        } else if (parserType.toLowerCase().equals("nycorder")) {
            parser = new NYCOrderXMLParser();
        } else if (parserType.toLowerCase().equals("nycresponse")) {
            parser = new NYCResponseXMLParser();
        }
        return parser;
    }
}

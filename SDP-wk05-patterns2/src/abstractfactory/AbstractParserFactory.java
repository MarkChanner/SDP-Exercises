package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public interface AbstractParserFactory {

    public XMLParser getParserInstance(String parserType);

}

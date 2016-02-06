package abstractfactory;

/**
 * SDP Design Patterns II
 * Question 4 - Abstract Factory
 * Mark Channer
 */
public class ParserFactoryProducer {

    public static AbstractParserFactory getFactory(String factory) {
        AbstractParserFactory parserFactory = null;
        if (factory.toLowerCase().equals("nycfactory")) {
            parserFactory = new NYParserFactory();
        } else if (factory.toLowerCase().equals("londonfactory")) {
            parserFactory = new LondonParserFactory();
        }
        return parserFactory;
    }

}

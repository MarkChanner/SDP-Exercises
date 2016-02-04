package strategy;
/**
 * SDP Design Patterns II
 * Question 2 - Strategy Pattern
 * Mark Channer
 */

public class CapTextFormatter implements TextFormatter {

    public void format(String text) {
        System.out.println(text.toUpperCase());
    }
}

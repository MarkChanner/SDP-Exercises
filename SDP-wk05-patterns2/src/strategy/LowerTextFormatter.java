package strategy;
/**
 * SDP Design Patterns II
 * Question 2 - Strategy Pattern
 * Mark Channer
 */

public class LowerTextFormatter implements TextFormatter {

    public void format(String text) {
        System.out.println("[LowerTextFormatter] " + text.toLowerCase());
    }
}
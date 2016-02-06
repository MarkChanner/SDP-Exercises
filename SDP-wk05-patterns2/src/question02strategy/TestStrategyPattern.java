package question02strategy;
/**
 * SDP Design Patterns II
 * Question 2 - Strategy Pattern
 * Mark Channer
 */

public class TestStrategyPattern {
    public static void main(String[] args) {
        TextFormatter formatter = new CapTextFormatter();
        TextEditor editor = new TextEditor(formatter);
        editor.publishText("Testing text in caps formatter");
        formatter = new LowerTextFormatter();
        editor = new TextEditor(formatter);
        editor.publishText("Testing text in lower formatter");
    }
}
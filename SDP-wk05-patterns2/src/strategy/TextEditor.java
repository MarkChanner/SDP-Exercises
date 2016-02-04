package strategy;
/**
 * SDP Design Patterns II
 * Question 2 - Strategy Pattern
 * Mark Channer
 */

public class TextEditor {

    private TextFormatter formatter;

    public TextEditor(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void publishText(String text) {
        formatter.format(text);
    }

}

package question12composite;

/**
 * SDP Design Patterns II
 * Question 12 - Composite Pattern
 * Mark Channer
 */
public class HtmlElement extends HtmlTag {

    String tagName;
    String startTag;
    String endTag;
    String body;

    public HtmlElement(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        endTag = tag;
    }

    @Override
    public void setTagBody(String tagBody) {
        body = tagBody;
    }

    @Override
    public void generateHtml() {
        System.out.print(startTag);
        if (body != null) System.out.print(body);
        System.out.println(endTag);
    }
}

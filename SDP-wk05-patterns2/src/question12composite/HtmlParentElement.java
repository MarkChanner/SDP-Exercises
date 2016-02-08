package question12composite;

import java.util.ArrayList;
import java.util.List;

/**
 * SDP Design Patterns II
 * Question 12 - Composite Pattern
 * Mark Channer
 */
public class HtmlParentElement extends HtmlTag {

    List<HtmlTag> children = new ArrayList<>();
    String tagName;
    String startTag;
    String endTag;

    public HtmlParentElement(String tagName) {
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
    public void addChildTag(HtmlTag htmlTag) {
        children.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        children.remove(htmlTag);
    }

    @Override
    public List<HtmlTag> getChildren() {
        return children;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for (HtmlTag child : children) {
            child.generateHtml();
        }
        System.out.println(endTag);
    }
}

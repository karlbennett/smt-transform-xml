package shiver.me.timbers.transform.xml.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Element extends CompositeTokenTransformation {
    public static final String NAME = "element";

    public Element(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Attribute extends CompositeTokenTransformation {
    public static final String NAME = "attribute";

    public Attribute(TokenApplier applier) {
        super(NAME, applier);
    }
}

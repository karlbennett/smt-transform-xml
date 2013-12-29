package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Dtd extends CompositeTokenTransformation {
    public static final String NAME = "DTD";

    public Dtd(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Name extends CompositeTokenTransformation {
    public static final String NAME = "Name";

    public Name(TokenApplier applier) {
        super(NAME, applier);
    }
}

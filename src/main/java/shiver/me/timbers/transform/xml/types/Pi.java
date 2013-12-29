package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Pi extends CompositeTokenTransformation {
    public static final String NAME = "PI";

    public Pi(TokenApplier applier) {
        super(NAME, applier);
    }
}

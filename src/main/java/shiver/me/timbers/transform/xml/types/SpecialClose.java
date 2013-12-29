package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SpecialClose extends CompositeTokenTransformation {
    public static final String NAME = "SPECIAL_CLOSE";

    public SpecialClose(TokenApplier applier) {
        super(NAME, applier);
    }
}

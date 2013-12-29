package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Slash extends CompositeTokenTransformation {
    public static final String NAME = "'/'";

    public Slash(TokenApplier applier) {
        super(NAME, applier);
    }
}

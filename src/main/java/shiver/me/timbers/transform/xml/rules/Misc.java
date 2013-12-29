package shiver.me.timbers.transform.xml.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Misc extends CompositeTokenTransformation {
    public static final String NAME = "misc";

    public Misc(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Prolog extends CompositeTokenTransformation {
    public static final String NAME = "prolog";

    public Prolog(TokenApplier applier) {
        super(NAME, applier);
    }
}

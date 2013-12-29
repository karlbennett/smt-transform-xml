package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Equals extends CompositeTokenTransformation {
    public static final String NAME = "'='";

    public Equals(TokenApplier applier) {
        super(NAME, applier);
    }
}

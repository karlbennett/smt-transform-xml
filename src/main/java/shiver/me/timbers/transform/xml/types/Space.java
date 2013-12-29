package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Space extends CompositeTokenTransformation {
    public static final String NAME = "S";

    public Space(TokenApplier applier) {
        super(NAME, applier);
    }
}

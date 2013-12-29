package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SeaWhiteSpace extends CompositeTokenTransformation {
    public static final String NAME = "SEA_WS";

    public SeaWhiteSpace(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Cdata extends CompositeTokenTransformation {
    public static final String NAME = "CDATA";

    public Cdata(TokenApplier applier) {
        super(NAME, applier);
    }
}

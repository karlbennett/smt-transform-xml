package shiver.me.timbers.transform.xml.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Chardata extends CompositeTokenTransformation {
    public static final String NAME = "chardata";

    public Chardata(TokenApplier applier) {
        super(NAME, applier);
    }
}

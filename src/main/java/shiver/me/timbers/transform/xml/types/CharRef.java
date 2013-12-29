package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class CharRef extends CompositeTokenTransformation {
    public static final String NAME = "CharRef";

    public CharRef(TokenApplier applier) {
        super(NAME, applier);
    }
}

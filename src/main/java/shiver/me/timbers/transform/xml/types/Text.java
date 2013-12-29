package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Text extends CompositeTokenTransformation {
    public static final String NAME = "TEXT";

    public Text(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Document extends CompositeTokenTransformation {
    public static final String NAME = "document";

    public Document(TokenApplier applier) {
        super(NAME, applier);
    }
}

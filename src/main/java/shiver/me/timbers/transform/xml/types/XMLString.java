package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class XMLString extends CompositeTokenTransformation {
    public static final String NAME = "STRING";

    public XMLString(TokenApplier applier) {
        super(NAME, applier);
    }
}

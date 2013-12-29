package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class XMLDeclOpen extends CompositeTokenTransformation {
    public static final String NAME = "XMLDeclOpen";

    public XMLDeclOpen(TokenApplier applier) {
        super(NAME, applier);
    }
}

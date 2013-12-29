package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Comment extends CompositeTokenTransformation {
    public static final String NAME = "COMMENT";

    public Comment(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.rules;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class Content extends CompositeTokenTransformation {
    public static final String NAME = "content";

    public Content(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class SlashClose extends CompositeTokenTransformation {
    public static final String NAME = "'/>'";

    public SlashClose(TokenApplier applier) {
        super(NAME, applier);
    }
}

package shiver.me.timbers.transform.xml.types;

import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.TokenApplier;

public class EntityRef extends CompositeTokenTransformation {
    public static final String NAME = "EntityRef";

    public EntityRef(TokenApplier applier) {
        super(NAME, applier);
    }
}

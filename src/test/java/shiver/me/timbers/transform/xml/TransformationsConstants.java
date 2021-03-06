package shiver.me.timbers.transform.xml;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.Token;
import shiver.me.timbers.antlr4.xml.XMLParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.CompositeTokenTransformation;
import shiver.me.timbers.transform.antlr4.CompoundTransformations;
import shiver.me.timbers.transform.antlr4.IterableTokenTransformations;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.language.test.WrappingTokenApplier;
import shiver.me.timbers.transform.xml.types.Comment;
import shiver.me.timbers.transform.xml.types.Name;

import java.util.Arrays;
import java.util.LinkedList;

import static java.util.Arrays.asList;
import static shiver.me.timbers.transform.language.test.TransformationsUtils.buildWrappingTransformationsFromPackageName;

public final class TransformationsConstants {

    private TransformationsConstants() {
    }

    public static final String TYPES_PACKAGE_NAME = "shiver.me.timbers.transform.xml.types";
    public static final String RULES_PACKAGE_NAME = "shiver.me.timbers.transform.xml.rules";

    public static final Transformations<TokenTransformation> TYPES_TRANSFORMATIONS =
            new IterableTokenTransformations(buildWrappingTransformationsFromPackageName(TYPES_PACKAGE_NAME));

    public static final Transformations<TokenTransformation> RULES_TRANSFORMATIONS =
            new IterableTokenTransformations(buildWrappingTransformationsFromPackageName(RULES_PACKAGE_NAME));

    @SuppressWarnings("unchecked")
    public static final Transformations<TokenTransformation> ALL_TRANSFORMATIONS =
            new IterableTokenTransformations(
                    new LinkedList<TokenTransformation>() {{
                        addAll(TYPES_TRANSFORMATIONS.asCollection());
                        addAll(RULES_TRANSFORMATIONS.asCollection());
                    }});

    public static final Transformations<TokenTransformation> UNUSED_TRANSFORMATIONS =
            new IterableTokenTransformations(
                    Arrays.<TokenTransformation>asList(
                            new CompositeTokenTransformation("unused_one", new WrappingTokenApplier("unused_one")),
                            new CompositeTokenTransformation("unused_two", new WrappingTokenApplier("unused_two")),
                            new CompositeTokenTransformation("unused_three", new WrappingTokenApplier("unused_three"))
                    )
            );

    public static final Transformations<TokenTransformation> NAMES_TRANSFORMATIONS =
            new CompoundTransformations(
                    asList(Name.NAME), new NamedWrappingTokenApplier());

    public static final Transformations<TokenTransformation> COMMENT_TRANSFORMATIONS = new CompoundTransformations(
            asList(Comment.NAME), new WrappingTokenApplier("COMMENT"));

    private static class NamedWrappingTokenApplier extends WrappingTokenApplier {

        public NamedWrappingTokenApplier() {
            super(Name.NAME);
        }

        @Override
        public String apply(RuleContext context, Token token, String string) {

            return isNotAttribute(context) ? super.apply(context, token, string) : string;
        }

        private static boolean isNotAttribute(RuleContext context) {

            return XMLParser.RULE_attribute != context.getRuleIndex();
        }
    }
}

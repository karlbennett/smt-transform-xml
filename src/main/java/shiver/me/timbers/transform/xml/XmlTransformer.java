package shiver.me.timbers.transform.xml;

import shiver.me.timbers.antlr4.xml.XMLParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.Antlr4StreamTransformer;
import shiver.me.timbers.transform.antlr4.TokenTransformation;

/**
 * A StreamTransformer for XML, it will apply any Transformations that have names matching the different token and rule names.
 * These names can be found in the {@link XMLParser#tokenNames} and {@link XMLParser#ruleNames}
 * arrays.
 */
public class XmlTransformer extends Antlr4StreamTransformer<XMLParser> {

    public XmlTransformer() {
        super(new XmlParserBuilder());
    }

    public XmlTransformer(Transformations<TokenTransformation> parentRuleTransformations) {
        super(new XmlParserBuilder(), parentRuleTransformations);
    }
}

package shiver.me.timbers.transform.xml;

import shiver.me.timbers.antlr4.xml.XMLParser;
import shiver.me.timbers.transform.antlr4.Antlr4StringTransformer;

/**
 * A StreamTransformer for XML, it will apply any Transformations that have names matching the different token and rule names.
 * These names can be found in the {@link XMLParser#tokenNames} and {@link XMLParser#ruleNames}
 * arrays.
 */
public class XmlTransformer extends Antlr4StringTransformer<XMLParser> {

    public XmlTransformer() {
        super(new XmlParserBuilder());
    }
}

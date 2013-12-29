package shiver.me.timbers.transform.xml;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import shiver.me.timbers.antlr4.xml.XMLLexer;
import shiver.me.timbers.antlr4.xml.XMLParser;
import shiver.me.timbers.transform.Transformations;
import shiver.me.timbers.transform.antlr4.ParserBuilder;
import shiver.me.timbers.transform.antlr4.TokenTransformation;
import shiver.me.timbers.transform.antlr4.listeners.LoggingErrorListener;
import shiver.me.timbers.transform.antlr4.listeners.TransformationAwareErrorListener;

/**
 * A {@code ParserBuilder} for the ANTLR4 {@code XmlParser}.
 */
public class XmlParserBuilder implements ParserBuilder<XMLParser> {

    @Override
    public XMLParser buildParser(String source, Transformations<TokenTransformation> errorTransformations) {

        final CharStream charStream = new ANTLRInputStream(source);

        final XMLLexer lexer = new XMLLexer(charStream);

        final TokenStream tokenStream = new BufferedTokenStream(lexer);

        final XMLParser parser = new XMLParser(tokenStream);
        parser.removeErrorListeners();
        parser.addErrorListener(new TransformationAwareErrorListener(new LoggingErrorListener(), errorTransformations));

        return parser;
    }

    @Override
    public ParseTree parse(XMLParser parser) {

        return parser.document();
    }
}

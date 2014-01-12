package shiver.me.timbers.transform.xml;

import org.junit.Test;
import shiver.me.timbers.transform.antlr4.IterableTokenTransformations;
import shiver.me.timbers.transform.language.test.TransformerTestTemplate;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.transform.xml.FileConstants.INVALID_TEST_FILE_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TEST_FILE_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_COMMENTS_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_INVALID_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_NAMES_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_RULES_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_TEST_FILE_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_TYPES_SOURCE;
import static shiver.me.timbers.transform.xml.TransformationsConstants.ALL_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.COMMENT_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.NAMES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.RULES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.TYPES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.UNUSED_TRANSFORMATIONS;

public class XmlTransformerTest implements TransformerTestTemplate {

    @Test
    @Override
    public void testCreate() {

        new XmlTransformer();
    }

    @Test
    @Override
    public void testTransform() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_TEST_FILE_SOURCE,
                new XmlTransformer().transform(TEST_FILE_SOURCE, ALL_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformKeywordsOnly() {

        assertEquals("only the names should be transformed.", TRANSFORMED_NAMES_SOURCE,
                new XmlTransformer().transform(TEST_FILE_SOURCE, NAMES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformCommentsOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_COMMENTS_SOURCE,
                new XmlTransformer().transform(TEST_FILE_SOURCE, COMMENT_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithInvalidSource() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_INVALID_SOURCE,
                new XmlTransformer().transform(INVALID_TEST_FILE_SOURCE, ALL_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithTypesOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_TYPES_SOURCE,
                new XmlTransformer().transform(TEST_FILE_SOURCE, TYPES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithRulesOnly() {

        assertEquals("the source should be Transformed correctly.", TRANSFORMED_RULES_SOURCE,
                new XmlTransformer().transform(TEST_FILE_SOURCE, RULES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformWithNoTransformations() {

        assertEquals("the source should be Transformed correctly.", TEST_FILE_SOURCE,
                new XmlTransformer().transform(TEST_FILE_SOURCE, new IterableTokenTransformations())
        );
    }

    @Test
    @Override
    public void testTransformWithIrrelevantTransformations() {

        assertEquals("the source should be Transformed correctly.", TEST_FILE_SOURCE,
                new XmlTransformer().transform(TEST_FILE_SOURCE, UNUSED_TRANSFORMATIONS));
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testTransformWithNullTransformations() {

        new XmlTransformer().transform(TEST_FILE_SOURCE, null);
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testTransformWithNullInput() {

        new XmlTransformer().transform(null, ALL_TRANSFORMATIONS);
    }
}

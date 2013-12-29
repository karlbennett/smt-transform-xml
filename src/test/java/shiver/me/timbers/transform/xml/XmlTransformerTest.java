package shiver.me.timbers.transform.xml;

import org.junit.Test;
import shiver.me.timbers.transform.language.test.TransformerTestTemplate;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformCommentsOnlyTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithClosedStreamTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithInvalidSourceTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithIrrelevantTransformationsTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithNoTransformationsTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithNullInputStreamTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithNullTransformationsTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithRulesOnlyTest;
import static shiver.me.timbers.transform.language.test.TransformerTestUtils.transformWithTypesOnlyTest;
import static shiver.me.timbers.transform.xml.FileConstants.INVALID_TEST_FILE_NAME;
import static shiver.me.timbers.transform.xml.FileConstants.SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_COMMENTS_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_INVALID_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_NAMES_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_RULES_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.TRANSFORMED_TYPES_SOURCE;
import static shiver.me.timbers.transform.xml.FileConstants.readTestFile;
import static shiver.me.timbers.transform.xml.TransformationsConstants.ALL_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.COMMENT_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.NAMES_TRANSFORMATIONS;
import static shiver.me.timbers.transform.xml.TransformationsConstants.PARENT_RULE_TRANSFORMATIONS;
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
    public void testCreateWithParentTransformations() {

        new XmlTransformer(PARENT_RULE_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testCreateWithNullParentTransformations() {

        new XmlTransformer(null);
    }

    @Test
    @Override
    public void testTransform() {

        transformTest(TRANSFORMED_SOURCE, new XmlTransformer(PARENT_RULE_TRANSFORMATIONS), readTestFile(),
                ALL_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformKeywordsOnly() {

        assertEquals("only the names should be transformed.", TRANSFORMED_NAMES_SOURCE,
                new XmlTransformer().transform(readTestFile(), NAMES_TRANSFORMATIONS));
    }

    @Test
    @Override
    public void testTransformCommentsOnly() {

        transformCommentsOnlyTest(TRANSFORMED_COMMENTS_SOURCE, new XmlTransformer(), readTestFile(),
                COMMENT_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithInvalidSource() {

        transformWithInvalidSourceTest(TRANSFORMED_INVALID_SOURCE, new XmlTransformer(PARENT_RULE_TRANSFORMATIONS),
                readTestFile(INVALID_TEST_FILE_NAME), ALL_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithTypesOnly() {

        transformWithTypesOnlyTest(TRANSFORMED_TYPES_SOURCE, new XmlTransformer(), readTestFile(),
                TYPES_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithRulesOnly() {

        transformWithRulesOnlyTest(TRANSFORMED_RULES_SOURCE, new XmlTransformer(), readTestFile(),
                RULES_TRANSFORMATIONS);
    }

    @Test
    @Override
    public void testTransformWithNoTransformations() {

        transformWithNoTransformationsTest(SOURCE, new XmlTransformer(), readTestFile());
    }

    @Test
    @Override
    public void testTransformWithIrrelevantTransformations() {

        transformWithIrrelevantTransformationsTest(SOURCE, new XmlTransformer(UNUSED_TRANSFORMATIONS), readTestFile(),
                UNUSED_TRANSFORMATIONS);
    }

    @Test(expected = RuntimeException.class)
    @Override
    public void testTransformWithClosedStream() throws IOException {

        transformWithClosedStreamTest(new XmlTransformer(), readTestFile(), ALL_TRANSFORMATIONS);
    }

    @Test(expected = AssertionError.class)
    @Override
    public void testTransformWithNullTransformations() {

        transformWithNullTransformationsTest(new XmlTransformer(), readTestFile());
    }

    @Test(expected = NullPointerException.class)
    @Override
    public void testTransformWithNullInputStream() {

        transformWithNullInputStreamTest(new XmlTransformer(), ALL_TRANSFORMATIONS);
    }
}

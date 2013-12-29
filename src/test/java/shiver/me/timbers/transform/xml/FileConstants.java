package shiver.me.timbers.transform.xml;

import shiver.me.timbers.transform.language.test.FileUtils;

import java.io.InputStream;

import static shiver.me.timbers.transform.language.test.FileUtils.readTestFileToString;

public final class FileConstants {

    private FileConstants() {
    }

    public static final String TEST_FILE_NAME = "Test.xml";
    public static final String INVALID_TEST_FILE_NAME = "InvalidTest.xml";
    public static final String TRANSFORMED_TEST_FILE_NAME = "Test.xml.transformed";
    public static final String TRANSFORMED_NAMES_TEST_FILE_NAME = "Test.xml.names";
    public static final String TRANSFORMED_COMMENTS_TEST_FILE_NAME = "Test.xml.comments";
    public static final String TRANSFORMED_INVALID_TEST_FILE_NAME = "InvalidTest.xml.transformed";
    public static final String TRANSFORMED_TYPES_TEST_FILE_NAME = "Test.xml.types";
    public static final String TRANSFORMED_RULES_TEST_FILE_NAME = "Test.xml.rules";

    public static final String SOURCE = readTestFileToString(FileConstants.class, TEST_FILE_NAME);
    public static final String TRANSFORMED_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_TEST_FILE_NAME);
    public static final String TRANSFORMED_NAMES_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_NAMES_TEST_FILE_NAME);
    public static final String TRANSFORMED_COMMENTS_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_COMMENTS_TEST_FILE_NAME);
    public static final String TRANSFORMED_INVALID_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_INVALID_TEST_FILE_NAME);
    public static final String TRANSFORMED_TYPES_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_TYPES_TEST_FILE_NAME);
    public static final String TRANSFORMED_RULES_SOURCE = readTestFileToString(FileConstants.class,
            TRANSFORMED_RULES_TEST_FILE_NAME);

    /**
     * @return the input stream for the default test file.
     */
    public static InputStream readTestFile() {

        return readTestFile(TEST_FILE_NAME);
    }

    /**
     * @return the input stream for the test file with the supplied name.
     */
    public static InputStream readTestFile(String fileName) {

        return FileUtils.readTestFile(FileConstants.class, fileName);
    }
}

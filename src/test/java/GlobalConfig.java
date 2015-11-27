/**
 * Diff Layouts v0.1 by Evgeniy Moskalenko
 *
 * @author Evgeniy Moskalenko - https://github.com/qa-utomation-java/difflayouts
 */
public class GlobalConfig {

    public static final String CURRENT_DIR = System.getProperty("user.dir");
    public static final String FS = System.getProperty("file.separator");

    public static final String DIR_ETHALON_SCREENSHOT = FS + "frontEnd_test" + FS + "ethalon";
    public static final String DIR_BUGS_SCREENSHOT = FS + "frontEnd_test" + FS + "bugs";

    public static final String FILE_INPUT_DATA_TEST_URL = FS + "testUrl" + FS + "InputDataTestUrl.txt";
    public static final String FILE_EXCLUDE_DATA_TEST_URL = FS + "testUrl" + FS + "ExcludeDataTestUrl.txt";
}

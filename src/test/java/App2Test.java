import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

public class App2Test {

//    @Rule
    public TemporaryFolder tmpFolder = new TemporaryFolder();

    @Test
    public void givenTempFolderRule_whenNewFile_thenFileIsCreated() throws IOException {
        File testFile = tmpFolder.newFile("test-file.txt");

        System.out.println();
//        assertTrue("The file should have been created: ", testFile.isFile());
//        assertEquals("Temp folder and test file should match: ",
//                tmpFolder.getRoot(), testFile.getParentFile());
    }

}

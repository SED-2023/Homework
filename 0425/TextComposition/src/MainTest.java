import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;

class MainTest {

    static String[] args;
    static String path = System.getProperty("user.dir");

    @BeforeEach
    void setup() throws IOException {
        this.args = new String[5];
    }

    @Test
    void testMain() throws IOException {
        Main m = new Main();
        m.main(new String[]{path + "\\sampleInput"});
        String file1 = path + "\\sampleOutput";
        String file2 = path + "\\outputFiles\\sampleOutput";
        assertTrue(parseTwoFiles(file1, file2));
    }

    @Test
    void testAll() throws IOException {
        File folder = new File(path + "\\testCase");
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith("_Input.txt")) {
                    String prefix = file.getName().replace("_Input.txt", "");
                    System.out.println("Test case: " + prefix);

                    String inputPath = path + "\\testCase\\" + file.getName();
                    Main m = new Main();
                    m.main(new String[]{inputPath});

                    String groundTruth = path + "\\testCase\\" + prefix + "_Output.txt";
                    String functionOutput = path + "\\outputFiles\\" + prefix + "_Output.txt";
                    assertTrue(parseTwoFiles(groundTruth, functionOutput));
                }
            }
        }
        assertTrue(true);
    }

    Boolean parseTwoFiles(String file1, String file2) throws IOException {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 != null && line2 != null) {
                if (!line1.equals(line2)) {
                    return false;
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
            }

            if (line1 != null || line2 != null) {
                return false;
            } else {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}

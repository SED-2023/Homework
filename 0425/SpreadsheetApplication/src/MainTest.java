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
        System.out.println("\nTest case: sample");
        System.out.println("Result: ");
        Main m = new Main();
        m.main(new String[]{path + "\\sampleInput"});
        String expectedFile = path + "\\sampleOutput";
        String actualFile = path + "\\outputFiles\\sampleOutput";
        assertTrue(parseTwoFiles(expectedFile, actualFile));
    }

    @Test
    void testAll() throws IOException {
        File folder = new File(path + "\\testCase");
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith("_Input.txt")) {
                    String prefix = file.getName().replace("_Input.txt", "");
                    System.out.println("\nTest case: " + prefix);
                    System.out.println("Result: ");

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

    Boolean parseTwoFiles(String expectedFile, String actualFile) throws IOException {
        try (BufferedReader expectedReader = new BufferedReader(new FileReader(expectedFile));
             BufferedReader actualReader = new BufferedReader(new FileReader(actualFile))) {

            String expectedLine = expectedReader.readLine();
            String actualLine = actualReader.readLine();

            while (expectedLine != null && actualLine != null) {
                if (!expectedLine.equals(actualLine)) {
                    System.out.println("\nExpected: " + expectedLine);
                    System.out.println("Actual  : " + actualLine);
                    return false;
                }

                expectedLine = expectedReader.readLine();
                actualLine = actualReader.readLine();
            }

            if (expectedLine != null || actualLine != null) {
                if(expectedLine != null )
                    System.out.println("\nExpected: " + expectedLine + "\nActual  : <none>");
                if(actualLine != null )
                    System.out.println("\nExpected: <none> \nActual  : "+ actualLine);
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

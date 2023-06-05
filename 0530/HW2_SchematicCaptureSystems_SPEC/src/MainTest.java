import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

class MainTest {
    static String path = System.getProperty("user.dir");

    @Test
    void testMain() throws IOException {
        System.out.println("\nTest case: sample");
        System.out.println("Result: ");

        Path projRootPath = Paths.get(path).getParent();
        String expectedFile = projRootPath + File.separator + "Sample0.out";
        String actualFile = projRootPath + File.separator + "outputFiles" + File.separator +  "sampleResult";

        assertTrue(parseTwoFiles(expectedFile, actualFile));
    }

    @Test
    void testPrintAll() throws IOException {
        Path projRootPath = Paths.get(path).getParent();
        String testCasePath = projRootPath.resolve("testCase").toString();

        File folder = new File(testCasePath);
        File[] files = folder.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith("_Output.txt")) {
                    String prefix = file.getName().replace("_Output.txt", "");
                    System.out.println("\nTest case: " + prefix);
                    System.out.println("Result: ");

                    String expectedFile = testCasePath + File.separator + prefix + "_Output.txt";
                    String actualFile = projRootPath + File.separator + "outputFiles" + File.separator + prefix + "_Result.txt";
                    assertTrue(parseTwoFiles(expectedFile, actualFile));
                }
            }
        } else {
            assertTrue(false);
        }
    }

    Boolean parseTwoFiles(String expectedFile, String actualFile) throws IOException {
        try (BufferedReader expectedReader = new BufferedReader(new FileReader(expectedFile));
             BufferedReader actualReader = new BufferedReader(new FileReader(actualFile))) {

            String expectedLine = expectedReader.readLine();
            String actualLine = actualReader.readLine();

            while (expectedLine != null && actualLine != null) {
				System.out.println(actualLine);
                if (!expectedLine.equals(actualLine)) {
                    System.out.println("\nExpected: " + expectedLine);
                    System.out.println("Actual  : " + actualLine);
                    return false;
                }

                expectedLine = expectedReader.readLine();
                actualLine = actualReader.readLine();
            }

            if (expectedLine != null || actualLine != null) {
                if (expectedLine != null)
                    System.out.println("\nExpected: " + expectedLine + "\nActual  : <none>");
                if (actualLine != null)
                    System.out.println("\nExpected: <none> \nActual  : " + actualLine);
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

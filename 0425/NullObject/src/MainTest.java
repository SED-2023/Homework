import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;

class MainTest {

    static String[] args;
    static String path = System.getProperty("user.dir");

    @BeforeEach
    void setup() throws IOException {
        this.args = new String[5];
    }

    @Test
    void parseTwoFiles() throws IOException {
        String file1 = "sampleOutput.out";
        String file2 = "output.txt";

        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
             BufferedReader reader2 = new BufferedReader(new FileReader(file2))) {

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();

            while (line1 != null && line2 != null) {
                if (!line1.equals(line2)) {
                    System.out.println("Files are different");
                    return;
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
            }

            if (line1 != null || line2 != null) {
                System.out.println("Files are different");
            } else {
                System.out.println("Files are the same");
            }
//            assertEquals();
//            assertEquals("Hello world!", m.main(args));

        } catch (IOException e) {
            e.printStackTrace();
        }
//        String inputFile = path + "\\sampleInput.in";
//        String outputFile = path + "\\sampleOutput.out";
//        System.out.println(inputFile);
//
//        try (BufferedReader inputReader = new BufferedReader(new FileReader(inputFile));
//             BufferedReader outputReader = new BufferedReader(new FileReader(outputFile))) {
//
//            String inputLine = inputReader.readLine();
//            String outputLine = outputReader.readLine();
//            String outputStr = "";
//
//            while (inputLine != null) {
//                inputLine = inputReader.readLine();
//            }
//
//            while (outputLine != null) {
//                outputStr += outputLine;
//                outputLine = outputReader.readLine();
//            }
//
//            Main m = new Main();
//            System.out.println(outputStr);
////            assertEquals("Hello world!", m.main(args));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
//
//    @Test
//    void print2() {
//        Main m = new Main();
//        assertEquals("Hello Laura!", m.main(args));
//    }
//
//    @Test
//    void testInput() throws IOException {
//        Main m = new Main();
//        assertEquals("Hello Laura!", m.main(args));
//    }

}

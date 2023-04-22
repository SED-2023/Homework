import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;

class MainTest {

    static String[] args;
    static String path = System.getProperty("user.dir");

    @BeforeEach
    void setup() throws IOException {
        this.args = new String[5];
    }

    @Test
    void testCase1() throws IOException {
        String inputFile = path + "\\sampleInput.in";
        String outputFile = path + "\\sampleOutput.out";
        System.out.println(inputFile);

        try (BufferedReader inputReader = new BufferedReader(new FileReader(inputFile));
             BufferedReader outputReader = new BufferedReader(new FileReader(outputFile))) {

            String inputLine = inputReader.readLine();
            String outputLine = outputReader.readLine();
            String outputStr = "";

            while (inputLine != null) {
                inputLine = inputReader.readLine();
            }

            while (outputLine != null) {
                outputStr += outputLine;
                outputLine = outputReader.readLine();
            }

            Main m = new Main();
            System.out.println(outputStr);
//            assertEquals("Hello world!", m.main(args));
        } catch (IOException e) {
            e.printStackTrace();
        }
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

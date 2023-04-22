import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class InputParser {
    public BufferedReader parse(String[] args) throws IOException {
        String filename = args[0];

        // input file start
        File fakeDataFile = new File(filename);
        BufferedReader fileReader = new BufferedReader(new FileReader(fakeDataFile));
        return fileReader;
    }
}

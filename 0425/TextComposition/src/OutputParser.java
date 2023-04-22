import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.io.File;

public class OutputParser {
    public void parse(ArrayList<String> lines, String filepath) {
        File file = new File(filepath);
        String path = System.getProperty("user.dir");
        String filename = path + "\\outputFiles\\" + file.getName();

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
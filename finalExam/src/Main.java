import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Application application = new Application();

        try {
            InputParser input = new InputParser();
            BufferedReader fileReader = input.parse(args);
            // add init books
            String line = fileReader.readLine();
            while (line != null) {
                String[] tokens = line.split(" ");
                String command = tokens[0];
                switch (command) {
                    case "student":
                        List<String> students = new ArrayList<>();
                        for (int i = 1; i < tokens.length; i++) {
                            students.add(tokens[i]);
                        }
                        application.addStudent(students);
                        break;
                    case "schoolStrategy":
                        List<String> schoolStrategy = new ArrayList<>();
                        List<String> levelScore = new ArrayList<>();
                        for (int i = 1; i < tokens.length; i++) {
                            String[] token_cache = tokens[i].split(",");
                            schoolStrategy.add(token_cache[1]);
                            levelScore.add(token_cache[2]);
                        }
                        application.setSchoolStrategy(schoolStrategy, levelScore);
                        break;
                    case "designCriterion":
                        String rubricFile = tokens[2];
                        List<List<String>> RubricFile = new ArrayList<>();
                        String path = System.getProperty("user.dir");
                        Path projRootPath = Paths.get(path).getParent();
                        String rubricFilePath = projRootPath + File.separator + rubricFile;
                        InputParser rubricInput = new InputParser();
                        BufferedReader rubricReader = rubricInput.parse(new String[]{rubricFilePath});
                        String rubricReader_line = rubricReader.readLine();
                        while (rubricReader_line != null){
                            List<String> cache = new ArrayList<>();
                            String[] rubricReader_token = rubricReader_line.split(" ");
                            for (int i = 0; i < rubricReader_token.length; i++) {
                                cache.add(rubricReader_token[i]);
                            }
                            RubricFile.add(cache);
                            rubricReader_line = rubricReader.readLine();
                        }
                        application.addHomework(command, RubricFile);
                        break;
                    case "assignment":
                        List<String> reviewer_id = new ArrayList<>();
                        List<List<String>> ScoreFile = new ArrayList<>();
                        for (int i = 3; i < tokens.length; i++) {
                            String[] token_cache = tokens[i].split(",");
                            reviewer_id.add(token_cache[0]);

                            String scoreFile = tokens[1];
                            String score_path = System.getProperty("user.dir");
                            Path score_projRootPath = Paths.get(score_path).getParent();
                            String scoreFilePath = score_projRootPath + File.separator + scoreFile;
                            InputParser scoreInput = new InputParser();
                            BufferedReader scoreReader = scoreInput.parse(new String[]{scoreFilePath});
                            String score_line = scoreReader.readLine();
                            List<String> cache = new ArrayList<>();
                            while (score_line != null){
                                cache.add(score_line);
                                score_line = scoreReader.readLine();
                            }
                            ScoreFile.add(cache);
                        }
                        application.reviewAssignment(tokens[1], tokens[2], reviewer_id, ScoreFile);
                        break;
                    case "printRubric":
                        application.printRubric(tokens[1]);
                        break;
                    case "averageCriterion":
                        application.averageCriterion(tokens[1]);
                        break;
                    case "calculateScore":
                        application.caculateScore(tokens[1], tokens[2], tokens[3]);
                        break;
                    case "findStrength":
                        application.findStrength(tokens[1], tokens[2], tokens[3]);
                        break;
                    case "findWeakness":
                        application.findWeakness(tokens[1], tokens[2], tokens[3]);
                        break;
                    default:
                        break;
                }
                line = fileReader.readLine();
            }
            fileReader.close();

        } catch (IOException ex) {
            System.out.println("Input Error");
        }
    }
}

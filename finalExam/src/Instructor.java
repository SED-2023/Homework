import java.util.ArrayList;
import java.util.LinkedHashMap;
public class Instructor{
    private LinkedHashMap<String, Student> students = new LinkedHashMap<>();
    private ArrayList<Level> schoolStrategy = new ArrayList<>();
    private LinkedHashMap<String, Homework> homeworks = new LinkedHashMap<>();
    private RubricBuilder rubricBuilder;
    private LinkedHashMap<String, RankingStrategy> calculateStrategies = new LinkedHashMap<>();

    public void addStudent(ArrayList<String> ss){
        for(String s: ss){
            Student student = new Student(s);
            students.put(s, student);
        }
    }

    public void setSchoolStrategy(ArrayList<String> level, ArrayList<String> score){
        //TODO: assert level.size() == score.size()
        for(int i=0; i<level.size(); i++){
            Level lv = new Level(level.get(i), Integer.parseInt(score.get(i)));
            schoolStrategy.add(lv);
        }
    }

    public void addHomework(){

    }
}

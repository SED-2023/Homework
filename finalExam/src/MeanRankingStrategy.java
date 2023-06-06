import java.util.ArrayList;

public class MeanRankingStrategy implements RankingStrategy {
    @Override
    public double calculate(ArrayList<Integer> scoreList) {
        // calculate scoreList avg
        double sum = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            sum += scoreList.get(i);
        }
        double avg = sum / scoreList.size();
        return avg;
    }
}

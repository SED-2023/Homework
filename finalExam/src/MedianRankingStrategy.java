import java.util.ArrayList;

public class MedianRankingStrategy implements RankingStrategy {
    @Override
    public double calculate(ArrayList<Integer> scoreList) {
        // calculate scoreList median
        int size = scoreList.size();
        if (size % 2 == 0) {
            double median = (scoreList.get(size / 2) + scoreList.get(size / 2 - 1)) / 2;
            return median;
        } else if (size % 2 == 1) {
            double median = scoreList.get(size / 2);
            return median;
        }
        return 0;
    }
}

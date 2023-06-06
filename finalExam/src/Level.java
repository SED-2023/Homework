public class Level {
    private String level;
    private int score;

    public Level(String level, int score) {
        this.level = level;
        this.score = score;
    }

    public String getLevel() {
        return level;
    }

    public int getScore() {
        return score;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

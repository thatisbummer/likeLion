package likeLion;

public class Player {
    String name;
    int score;
    public Player(String name) {
        this.name = name;
        this.score = 0;
    }
    public void addScore(int points) {
        this.score += points;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package likeLionDiceGame;

import java.util.Random;

public class Die {
    private int side;
    public Die(int side) {
        this.side = 6;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public int rolls() {
        Random random = new Random();
        int num = random.nextInt(1,7);
        return num;
    }
}

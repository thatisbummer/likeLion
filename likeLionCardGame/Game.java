package likeLionTestQ.likeLionCardGame;

public class Game {
    Player[] player;
    Deck deck;

    public Game(String player1, String player2) {
        player = new Player[2];
        player[0] = new Player(player1);
        player[1] = new Player(player2);
        deck = new Deck();
        deck.shuffle();
    }

    public void start() {
        for (int round = 1; round <= 5 ; round++) {
            System.out.print(" Round: " + round + " ");
            Card player1 = deck.draw();
            System.out.print(player[0].getName() + " draws ");
            System.out.print(player1);
            Card player2 = deck.draw();
            System.out.print(", "+player[1].getName() + " draws ");
            System.out.print(player2);

            if(player1.getNumber() > player2.getNumber()) {
                player[0].addScore(1);
                System.out.println(player[0].getName() + " wins!");
            }
            else if (player1.getNumber() < player2.getNumber()) {
                player[1].addScore(1);
                System.out.println(player[1].getName() + " wins!");
            }
        }
        System.out.print("Final score: " + player[0].getName() + " "  + player[0].getScore()
        + ", " + player[1].getName() + " " + player[1].getScore());
        if (player[0].getScore() > player[1].getScore()) {
            System.out.print(" -> " + player[0].getName() + " wins the game!");
        }
        else if (player[0].getScore() < player[1].getScore()) {
            System.out.print(" -> " + player[1].getName() + " wins the game!");
        }
    }
}

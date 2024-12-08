package likeLionDiceGame;

public class DiceGame {
    Player[] players;
    Die die;
    public DiceGame(String player1,String player2, String player3) {
        players = new Player[3];
        die = new Die(6);
        players[0] = new Player(player1);
        players[1] = new Player(player2);
        players[2] = new Player(player3);
    }
    public void play() {
        int rollsResult;
        for (int round = 1; round <= 5; round++) {
            System.out.println("Round: " + round);
            for (int i = 0; i < 3; i++) {
                rollsResult = 0;
                rollsResult += die.rolls();
                players[i].addScore(rollsResult);
                System.out.println(players[i].getName() + "rolls " + rollsResult);
            }
            System.out.println();
        }
        System.out.println("Final Scores");
        for (int i = 0; i < 3; i++) {
            System.out.println(players[i].getName() + ": " +players[i].getScore());

        }
        Player winner = players[0];
            for (int i = 1; i < players.length; i++) {
                if (players[i].getScore() > winner.getScore()) {
                    winner = players[i];
                } else if (players[i].getScore() == winner.getScore()) {
                    System.out.println("tie");
                    System.exit(1);
                }
        }
        System.out.println("Winner: " + winner.getName() + "!");
    }
}

package likeLionTestQ.likeLionCardGame;

import java.util.Random;

public class Deck {
    Card[] card;
    int size = 51;
    public Deck() {
        card = new Card[52];
        String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
        int n = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                card[n] = new Card(j,suit[i]);
                n++;
            }
        }
    }
    public void shuffle() {
        Random random = new Random();


        for (int i = 0; i < 100; i++) {
            int x = random.nextInt(0,52);
            int y = random.nextInt(0,52);

            Card temp = card[x];
            card[x] = card[y];
            card[y] = temp;
        }
    }

    public Card draw() {

        if (size == 0) {
            return null;
        } else {
            Card drawCard = card[size];
            card[size] = null;
            size--;
            return card[size];
        }
    }
}

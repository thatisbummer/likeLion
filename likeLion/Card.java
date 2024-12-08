package likeLion;

public class Card {
    int number;
    String suit;

    public Card(int number, String suit) {
        this.number = number;
        this.suit = suit;
    }

    public int getNumber() {
        return number;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return number + " of " + suit;
    }
}

package booleans.poker;

import java.util.Arrays;

    // This is a class to define the object "Hand". It creates a hand to be used with the hand generator.
public class Hand {
    booleans.poker.Card[] cards = new booleans.poker.Card[5];

    public Hand(booleans.poker.Card[] cards) {
        this.cards = cards;
    }

    public booleans.poker.Card[] getCards() {
        return cards;
    }

    public void setCards(booleans.poker.Card[] cards) {
        this.cards = cards;
    }

    public void sortCards() {
        Arrays.sort(cards);
    }

    public int NUM_PAIRS() {
        int numPairs = 0;
        for (int i = 0; i < cards.length-1; i++) {
            if (cards[i].getRank() == cards[i+1].getRank()) {
                if (i > 2 && cards[i-2].getRank() == cards[i].getRank()) {
                    continue;
                }
                numPairs++;
                i++;
            }
        }
        return numPairs;
    }

    public int NUM_SUITS() {
        int clubs = 0;
        int diamonds = 0;
        int hearts = 0;
        int spades = 0;

        for (int i = 0; i < cards.length; i++) {
            if (cards[i].getSuit() == booleans.poker.Card.Suit.CLUBS) {
                clubs = 1;
            }
            if (cards[i].getSuit() == booleans.poker.Card.Suit.DIAMONDS) {
                diamonds = 1;
            }
            if (cards[i].getSuit() == booleans.poker.Card.Suit.HEARTS) {
                hearts = 1;
            }
            if (cards[i].getSuit() == booleans.poker.Card.Suit.SPADES) {
                spades = 1;
            }
        }

        return clubs + hearts + diamonds + spades;
    }

    public boolean HAS_THREE_OF_A_KIND() {
        for (int i = 0; i < cards.length-2; i++) {
            if (cards[i].getRank() == cards[i+1].getRank() &&
                cards[i].getRank() == cards[i+2].getRank()) {
                return true;
            }
        }
        return false;
    }

    public boolean IS_STRAIGHT() {
        for (int i = 0; i < cards.length-1; i++) {
            if (cards[i].getRank().ordinal() + 1 != cards[i + 1].getRank().ordinal()) {
                return false;
            }
        }
        return true;
    }

    public booleans.poker.Card.Rank HIGHEST_RANK() {
        return cards[4].getRank();
    }

    public boolean HAS_FOUR_OF_A_KIND() {
        for (int i = 0; i < cards.length-2; i++) {
            if (cards[i].getRank() == cards[i+1].getRank() &&
                cards[i].getRank() == cards[i+2].getRank() &&
                cards[i].getRank() == cards[i+3].getRank()) {
                return true;
            }
        }
        return false;
    }

    public void printHand() {
        for (booleans.poker.Card c : cards) {
            System.out.println(c);
        }
    }
}

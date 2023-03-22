package booleans.poker;

import java.util.ArrayList;
import java.util.List;

public class HandGenerator {
    // This class creates a randomly generated hand to be used by the hand analyzer.
    public static List<booleans.poker.Hand> generateHands() {
        List<booleans.poker.Hand> hands = new ArrayList<>();

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.ACE, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.KING, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.QUEEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.JACK, booleans.poker.Card.Suit.DIAMONDS),
        }));


        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FIVE, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.QUEEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TWO, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.JACK, booleans.poker.Card.Suit.DIAMONDS),
        }));


        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.CLUBS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.SPADES),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.HEARTS),
                new booleans.poker.Card(booleans.poker.Card.Rank.JACK, booleans.poker.Card.Suit.DIAMONDS),
        }));

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.CLUBS),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.SPADES),
                new booleans.poker.Card(booleans.poker.Card.Rank.JACK, booleans.poker.Card.Suit.HEARTS),
                new booleans.poker.Card(booleans.poker.Card.Rank.JACK, booleans.poker.Card.Suit.DIAMONDS),
        }));

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.CLUBS),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.SPADES),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.HEARTS),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.DIAMONDS),
        }));

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.CLUBS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FIVE, booleans.poker.Card.Suit.SPADES),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.HEARTS),
                new booleans.poker.Card(booleans.poker.Card.Rank.JACK, booleans.poker.Card.Suit.DIAMONDS),
        }));

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.KING, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.CLUBS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FIVE, booleans.poker.Card.Suit.SPADES),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.HEARTS),
                new booleans.poker.Card(booleans.poker.Card.Rank.JACK, booleans.poker.Card.Suit.DIAMONDS),
        }));

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TWO, booleans.poker.Card.Suit.CLUBS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FIVE, booleans.poker.Card.Suit.SPADES),
                new booleans.poker.Card(booleans.poker.Card.Rank.SIX, booleans.poker.Card.Suit.HEARTS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FOUR, booleans.poker.Card.Suit.DIAMONDS),
        }));

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.TWO, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FIVE, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.SIX, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FOUR, booleans.poker.Card.Suit.DIAMONDS),
        }));

        hands.add(new booleans.poker.Hand(new booleans.poker.Card[] {
                new booleans.poker.Card(booleans.poker.Card.Rank.TEN, booleans.poker.Card.Suit.DIAMONDS),
                new booleans.poker.Card(booleans.poker.Card.Rank.FOUR, booleans.poker.Card.Suit.CLUBS),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.SPADES),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.HEARTS),
                new booleans.poker.Card(booleans.poker.Card.Rank.THREE, booleans.poker.Card.Suit.DIAMONDS),
        }));

        return hands;
    }

}

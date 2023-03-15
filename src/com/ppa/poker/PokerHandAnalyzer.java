package booleans.poker;

public class PokerHandAnalyzer {

    public enum HandType {
        HIGH_CARD,
        PAIR,
        TWO_PAIR,
        THREE_OF_A_KIND,
        STRAIGHT,
        FLUSH,
        FULL_HOUSE,
        FOUR_OF_A_KIND,
        STRAIGHT_FLUSH,
        ROYAL_FLUSH
    }

    private static HandType analyzeHand(Hand hand) {
        hand.sortCards();

        if (hand.IS_STRAIGHT()) {
            if (hand.NUM_SUITS() == 1) {
                if (hand.HIGHEST_RANK() == Card.Rank.ACE) {
                    return HandType.ROYAL_FLUSH;
                }
                return HandType.STRAIGHT_FLUSH;
            }
            return HandType.STRAIGHT;
        }
        if (hand.NUM_SUITS() == 1) {
            return HandType.FLUSH;
        }
        if (hand.HAS_FOUR_OF_A_KIND()) {
            return HandType.FOUR_OF_A_KIND;
        }
        if (hand.HAS_THREE_OF_A_KIND()) {
            if (hand.NUM_PAIRS() == 2) {
                return HandType.FULL_HOUSE;
            }
            return HandType.THREE_OF_A_KIND;
        }
        if (hand.NUM_PAIRS() == 2) {
            return HandType.TWO_PAIR;
        }
        if (hand.NUM_PAIRS() == 1) {
            return HandType.PAIR;
        }
        return HandType.HIGH_CARD;
    }

    public static void main(String... args) {
        for (Hand hand : HandGenerator.generateHands()) {
            System.out.println();
            hand.printHand();
            System.out.println(analyzeHand(hand));
        }
    }
}

package com.frank;

public class SwissPlayingCard extends PlayingCard{

    private static final CardValue DEFAULTCARDVALUE = CardValue.JOKER;
    private static final CardColor DEFAULTCOLOR     = CardColor.BLACK;
    private static final CardSuit DEFAULTSUIT       = CardSuit.JOKER;
    private static final CardValue MAXVALUE         = CardValue.KING;
    private static final CardValue MINVALUE         = CardValue.JOKER;

    public static enum CardColor {
        YELLOW, GREEN, RED, BLACK
    }
    public static enum CardSuit {
        BALLS, ACORNS, ROSES, SHIELDS, JOKER
    }
    public static enum CardValue {
        JOKER, ONE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }

    public SwissPlayingCard(CardValue value, CardSuit suit) {
        super(value.ordinal(), suit.toString(),
                suit != CardSuit.JOKER ? CardColor.values()[suit.ordinal()].toString() : CardColor.BLACK.toString());
    }

    @Override
    public String toString() {
        return "SwissPlayingCard: "
                + "Value: " + super.getValue() + " ("
                + SwissPlayingCard.CardValue.values()[super.getValue()] + ")"
                + " - Color: " + super.getColor()
                + " - Suit: " + getSuit()
                + " - super.toString()=" + super.toString() + "\n";
    }

    @Override
    public void showCard() {
        System.out.println(this.toString());
    }
}

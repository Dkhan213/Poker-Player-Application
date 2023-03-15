package com.frank;

public class ItalianPlayingCard extends PlayingCard{

    private static final CardValue DEFAULTCARDVALUE = CardValue.JOKER;
    private static final CardColor DEFAULTCOLOR     = CardColor.BLACK;
    private static final CardSuit DEFAULTSUIT       = CardSuit.JOKER;
    private static final CardValue MAXVALUE         = CardValue.KING;
    private static final CardValue MINVALUE         = CardValue.JOKER;

    public static enum CardColor {
        YELLOW, BLUE, RED, BLACK
    }
    public static enum CardSuit {
        COINS, CUPS, SWORDS, BATONS, JOKER
    }
    public static enum CardValue {
        JOKER, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, TEN, JACK, QUEEN, KING
    }

    public ItalianPlayingCard(CardValue value, CardSuit suit) {
        super(value.ordinal(), suit.toString(),
                suit != CardSuit.JOKER ? CardColor.values()[suit.ordinal()].toString() : CardColor.BLACK.toString());
    }

    @Override
    public String toString() {
        return "ItalianPlayingCard: "
                + "Value: " + super.getValue() + " ("
                + ItalianPlayingCard.CardValue.values()[super.getValue()] + ")"
                + " - Color: " + super.getColor()
                + " - Suit: " + getSuit()
                + " - super.toString()=" + super.toString() + "\n";
    }

    @Override
    public void showCard() {
        System.out.println(this.toString());
    }
}

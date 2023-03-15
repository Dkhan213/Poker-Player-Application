package com.frank;

public class UsePlayingCards {
// This is our application program which will instantiate object and use thier methods to manipulate them
// We know this is the application program because it has the main() method
	public static void main(String[] args) {

		com.frank.PlayingCard aUSACard = new com.frank.AmericanPlayingCard(com.frank.AmericanPlayingCard.CardValue.ACE, com.frank.AmericanPlayingCard.CardSuit.HEART);
		System.out.println("aUSACard is :");
		aUSACard.showCard();  // runs the AmericanPlayingCard showCard()

		com.frank.AmericanPlayingCard aUSACard2 = new com.frank.AmericanPlayingCard(com.frank.AmericanPlayingCard.CardValue.KING, com.frank.AmericanPlayingCard.CardSuit.SPADE);
		System.out.println("aUSACard2 is :");
		aUSACard2.showCard();  // runs the AmericanPlayingCard showCard()

		com.frank.PlayingCard aItalianCard = new com.frank.ItalianPlayingCard(com.frank.ItalianPlayingCard.CardValue.FOUR, com.frank.ItalianPlayingCard.CardSuit.CUPS);
		System.out.println("aItalianCard is :");
		aItalianCard.showCard();

		com.frank.PlayingCard aSwissCard = new com.frank.SwissPlayingCard(com.frank.SwissPlayingCard.CardValue.SIX, com.frank.SwissPlayingCard.CardSuit.BALLS);
		System.out.println("aSwissCard is :");
		aSwissCard.showCard();

	}  // End of main()

}  // End of class that holds main()

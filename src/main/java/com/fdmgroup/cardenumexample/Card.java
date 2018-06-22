package com.fdmgroup.cardenumexample;

public class Card {

	private final Suit suit;
	private final Face face;

	public Card(Suit suit, Face face) {
		this.suit = suit;
		this.face = face;
	}

	public String getSuit() {
		return suit.getSuitAsString();
	}

	public String getFace() {
		return face.getFaceAsString();
	}
	
	public int getCardValue() {
		return face.getCardValue();
	}
	
	public String toString() {
		return "The " + this.getFace() + " of " + this.getSuit();
	}
}
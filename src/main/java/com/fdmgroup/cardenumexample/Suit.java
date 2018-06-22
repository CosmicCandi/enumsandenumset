package com.fdmgroup.cardenumexample;

public enum Suit {

	CLUBS("Clubs"),
	DIAMONDS("Diamonds"),
	HEARTS("Hearts"),
	SPADES("Spades");

	private String suitAsString;

	private Suit(String suitAsString) {
		this.suitAsString = suitAsString;
	}

	public String getSuitAsString(){
            return this.suitAsString;
    }
}
package com.fdmgroup.cardenumexample;

public enum Face {
	TWO("Two", 2),
	THREE("Three", 3),
	FOUR("Four", 4),
	FIVE("Five", 5),
	SIX("Six", 6),
	SEVEN("Seven", 7),
	EIGHT("Eight", 8),
	NINE("Nine", 9),
	TEN("Ten", 10),
	JACK("Jack", 10),
	QUEEN("Queen", 10),
	KING("King", 10),
	ACE("Ace", 11);
	
	private String faceAsString;
	private int cardValue;
	
	private Face(String faceAsString, int cardValue) {
		this.faceAsString = faceAsString;
		this.cardValue = cardValue;
	}

	public String getFaceAsString() {
		return faceAsString;
	}

	public int getCardValue() {
		return cardValue;
	}
	
}

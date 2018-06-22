package com.fdmgroup.cardenumexample;

import java.util.ArrayList;
import java.util.EnumSet;

public class Deck {
	static EnumSet<Suit> redSuits = EnumSet.of(Suit.HEARTS, Suit.DIAMONDS);
	static EnumSet<Suit> blackSuits = EnumSet.complementOf(redSuits);
	static EnumSet<Face> faceCards = EnumSet.of(Face.ACE, Face.JACK, Face.QUEEN, Face.KING);
	static EnumSet<Face> regularCards = EnumSet.complementOf(faceCards);
		
	public static void main(String[] args) {
		//Print Red Suits
		for (Suit suit : redSuits) {
			System.out.println( suit + " ");
		}
		
		//Print Black Suits
		for (Suit suit : blackSuits) {
			System.out.println(suit + " ");
		}
		
		//Print Non-Face Cards
		System.out.println(regularCards);

		//Show the size of the regular cards set
		System.out.println("The number of regular cards is: " + regularCards.size());
		
		//Print Face Cards
		System.out.println(faceCards);
		
		//Show the  size of the Face Cards set
		System.out.println("The number of face cards is: " + faceCards.size());
	
		//Create an ArrayList of Cards from the Red EnumSet
		EnumSet<Face> card = EnumSet.noneOf(Face.class);
		ArrayList<Card> deck = new ArrayList();
		for (Suit suit : redSuits) {
			for (Face face : regularCards) {
				Card createdCard = new Card(suit, face);
				deck.add(createdCard);
				}
			for (Face face : faceCards) {
				Card createdCard = new Card(suit, face);
				deck.add(createdCard);
			}
			
			System.out.println("The number of red cards in the deck is: " + deck.size());
			System.out.println("They are: ");
				for (Card c : deck) { 
					System.out.println(c.toString());
				}
			}
	
	}
}

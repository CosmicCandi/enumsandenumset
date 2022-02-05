package com.fdmgroup.cardenumexample;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DeckTest {

	ArrayList<Card> deck = new ArrayList<>();
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_ADeckContains52Cards() {
		buildDeck();
		assertEquals(52, deck.size());
	}

	public ArrayList<Card> buildDeck() {
		for (Suit suit : Suit.values()) {
			for (Face face : Face.values()) {
				Card createdCard = new Card(suit, face);
				deck.add(createdCard);
			}
		}
		return deck;
	}

}

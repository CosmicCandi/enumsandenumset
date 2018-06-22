package com.fdmgroup.cardenumexample;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
public class CardTest {

	Card aceOfHearts;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		aceOfHearts = new Card(Suit.HEARTS, Face.ACE);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test_ACardHasASuit() {
		
		assertEquals("Hearts", aceOfHearts.getSuit());
		assertNotNull(aceOfHearts.getSuit());
	}
	
	@Test
	public void test_ACardHasAFace() {
		assertEquals("Ace", aceOfHearts.getFace());
		assertNotNull(aceOfHearts.getFace());
	}
	
	@Test 
	public void test_ACardHasAValue() {
		assertNotNull(aceOfHearts.getCardValue());
	}
	
	@Test 
	public void test_ACardsFullStringIsBuiltProperly() {
		assertEquals("The Ace of Hearts", aceOfHearts.toString());
	}

	@Test
	public void test_ACardsValueMatchesItsFace() {
		assertEquals(Face.ACE.getCardValue(), aceOfHearts.getCardValue());
	}
	
}
package rs.deckofcards.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

import rs.deckofcards.model.Card;
import rs.deckofcards.service.DeckOfCards;

public class DeckOfCardsTest {
	
	private static final Logger logger = LogManager.getLogger(DeckOfCardsTest.class);
	
	private DeckOfCards createDeck(){
		return new DeckOfCards();
	}
	
	@Test
	public void testDisplayDeckOfCards(){
		DeckOfCards deckOfCards = createDeck();
		Assert.assertNotNull(deckOfCards);
		deckOfCards.displayCards();
	}
	
	@Test
	public void testShuffleDeck(){
		DeckOfCards deckOfCards = createDeck();
		Assert.assertNotNull(deckOfCards);
		deckOfCards.displayCards();
		logger.info("**************Shuffling the deck**************");
		deckOfCards.shuffle();
		deckOfCards.displayCards();
	}
	
	@Test
	public void testDealOneCard(){
		DeckOfCards deckOfCards = createDeck();
		Assert.assertNotNull(deckOfCards);
		deckOfCards.displayCards();
		Card card = deckOfCards.dealOneCard();
		Assert.assertNotNull(card);
		deckOfCards.displayCards();
	}
	
	@Test
	public void testDealingCard53Times(){
		DeckOfCards deckOfCards = createDeck();
		Assert.assertNotNull(deckOfCards);
		deckOfCards.shuffle();
		for(int i=1;i<=52;i++){
			Assert.assertNotNull(deckOfCards.dealOneCard());
		}
		//calling 53rd time
		Assert.assertNull(deckOfCards.dealOneCard());
	}
}

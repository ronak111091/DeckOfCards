package rs.deckofcards.service;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import rs.deckofcards.model.Card;
import rs.deckofcards.model.FaceValue;
import rs.deckofcards.model.Suit;

public class DeckOfCards {
	
	private LinkedList<Card> deck;
	
	private static final Logger logger = LogManager.getLogger(DeckOfCards.class);
	
	public List<Card> getDeck() {
		return deck;
	}

	public DeckOfCards() {
		super();
		deck= new LinkedList<>();
		Card card = null;
		for(Suit suit : Suit.values()){
			for(FaceValue faceValue : FaceValue.values()){
				card = new Card(suit, faceValue);
				deck.add(card);
			}
		}
	}
	
	public void shuffle(){
		if(!deck.isEmpty()){
			Collections.shuffle(deck);
		}
	}
	
	public Card dealOneCard(){
		if(!deck.isEmpty()){
			return deck.removeFirst();
		}
		return null;
	}
	
	public void displayCards(){
		logger.info("***************Deck of cards***************");
		Iterator<Card> iterator = deck.iterator();
		Card card = null;
		while(iterator.hasNext()){
			card=iterator.next();
			logger.info(card);
		}
		logger.info("Deck size: "+deck.size());
	}
}

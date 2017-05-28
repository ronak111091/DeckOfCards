package rs.deckofcards.service;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import rs.deckofcards.model.Card;
import rs.deckofcards.model.FaceValue;
import rs.deckofcards.model.Suit;

public class DeckOfCards {
	
	private LinkedList<Card> deck;
	
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
		Collections.shuffle(deck);
	}
	
	public Card dealOneCard(){
		if(!deck.isEmpty()){
			return deck.removeFirst();
		}
		return null;
	}
	
	public void displayCards(){
		System.out.println("***************Deck of cards***************");
		Iterator<Card> iterator = deck.iterator();
		Card card = null;
		while(iterator.hasNext()){
			card=iterator.next();
			System.out.println(card);
		}
		System.out.println("Deck size: "+deck.size());
	}
}

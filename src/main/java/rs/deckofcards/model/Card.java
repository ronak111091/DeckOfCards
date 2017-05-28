package rs.deckofcards.model;

public class Card {
	
	private Suit suit;
	private FaceValue faceValue;
	
	public Card(Suit suit, FaceValue faceValue) {
		super();
		this.suit = suit;
		this.faceValue = faceValue;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public void setSuit(Suit suit) {
		this.suit = suit;
	}
	
	public FaceValue getFaceValue() {
		return faceValue;
	}
	
	public void setFaceValue(FaceValue faceValue) {
		this.faceValue = faceValue;
	}
	
	@Override
	public String toString() {
		return faceValue.name()+" of "+suit.getName();
	}
}

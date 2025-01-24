/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: Akash Goyal
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
import java.util.ArrayList;

public final class Card {
    //
    // Instance Data Fields
    //
    private int artSize = 0;       // Please change artSize, if needed, to get an identical output
    private String artSymbol = ""; // Please change artFont, if needed, to get an identical output
    private String artFont;
    private int cardCount;
    private String cardRecipient;
    private String cardMessage;

    private ArrayList<Card> cardArray; // Holds a collection of Card objects
    //
    // Constructors
    //
    public Card() {
        cardArray = new ArrayList<>(); // Initializing the cardArray to store multiple Card objects
    }
    public Card(String cardRecipient, String artSymbol, String cardMessage, int artSize, String artFont){
        this.cardRecipient = cardRecipient;
        this.artSymbol = artSymbol;
        this.cardMessage = cardMessage;
        this.artSize = artSize;
        this.artFont = artFont;
    }
    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    public int getArtSize() {
        return artSize;
    }
    public String getCardRecipient() {
        return cardRecipient;
    }
    public void setCardRecipient(String cardRecipient) {
        this.cardRecipient = cardRecipient;
    }
    public String getArtSymbol() {
        return artSymbol;
    }
    public void setArtSymbol(String artSymbol) {
        this.artSymbol = artSymbol;
    }
    public String getCardMessage() {
        return cardMessage;
    }
    public void setCardMessage(String cardMessage) {
        this.cardMessage = cardMessage;
    }
    public int getCardCount() {
        return cardCount;
    }
    public void setCardCount(int cardCount) {
        this.cardCount = cardCount;
    }
    public String getArtFont() {
        return artFont;
    }
    public ArrayList<Card> getCardArray() {
        return cardArray;
    }
    public Card getSingleCard(int i){
        return cardArray.get(i);
    }
    //
    // Language
    //

}

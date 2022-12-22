import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
   
    /** */
    public Deck() {
         for (int j = 0; j < 13; j++) {
            for (int i = 0; i < 4; i++) {
                cards.add(new Card(i + 1, j + 1));
            }
         }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }
    public ArrayList<Card> getDeck() {
        return cards;
    }
    /**
     * Gets specifed card based off of index
     * @param cardIndex
     * @return
     * @see #dealTopCard()
     */
    public Card getCard(int cardIndex) {
        return cards.get(cardIndex);
    }
    /**
     * deals the top card of the deck
     * <p>
     * longer description
     * @return The top card in the deck
     */
    public Card dealTopCard() {
        Card tempCard = new Card();
        tempCard = cards.get(0);
        cards.remove(0);
        return tempCard;

    }

}

import java.util.ArrayList;
import java.util.Collections;
public class Deck {
    private ArrayList<Card> cards = new ArrayList<Card>();
    
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
    public Card getCard(int cardIndex) {
        return cards.get(cardIndex);
    }
    public void removeCard(int cardIndex) {
        cards.remove(cardIndex);
    }
}

import java.util.ArrayList;
public class Player {

private ArrayList<Card> hand = new ArrayList<Card>(); 

private int chipsAmount;

    public Player() {
        chipsAmount = 0;
    }
    public Player(int amount) {
        chipsAmount = amount;
    }

    public int getChipsAmount() {
        return chipsAmount;
    }
    public void setChipsAmount(int amount) {
        chipsAmount = amount;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }
    public void addCard(Card card) {
        hand.add(card);
    }
    public int getHandAmount(Card card) {
        int amount = 0;
        for(Card cardHand: this.getHand()){
            amount = amount + cardHand.getFace();
        }
        return amount;
    }
}
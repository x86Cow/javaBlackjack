import java.util.ArrayList;
public class Player {

ArrayList<Card> hand = new ArrayList<Card>(); 

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
}
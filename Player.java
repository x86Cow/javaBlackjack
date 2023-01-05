import java.util.ArrayList;
public class Player {

    private ArrayList<Card> hand = new ArrayList<Card>(); 

    private int chipsAmount;
    private int betAmount;
    private String name;


    public Player() {
        chipsAmount = 100;
    }
    public Player(int amount, String name) {
        chipsAmount = amount;
        this.name = name;
    }

    public int getChipsAmount() {
        return chipsAmount;
    }
    public void setChipsAmount(int amount) {
        chipsAmount = amount;
    }
    public int getBet() {
        return betAmount;
    }
    public void setBet(int amount) {
        betAmount = amount;
    }
    public ArrayList<Card> getHand() {
        return hand;
    }
    public void clearHand() {
        hand.clear();
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
    public String getName() {
        return name;
    }
}
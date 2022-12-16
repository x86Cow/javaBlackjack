import java.util.ArrayList;
public class player {

ArrayList<card> hand; 

private int chipsAmount;
    public player() {
        chipsAmount = 0;
    }
    public player(int amount) {
        chipsAmount = amount;
    }
    public int getChipsAmount() {
        return chipsAmount;
    }
    public void setChipsAmount(int amount) {
        chipsAmount = amount;
    }
}
import java.util.Scanner;
class Main{
    private static Scanner input = new Scanner(System.in);
    /*
    input.next() gets the next text up to a space
    input.nextLine() gets the next line (up to enter)
    input.nextInt()
    input.nextBool()
    input.nextChar()
    */
    static Player user = new Player(100);
    Player dealer = new Player(100);
    static Deck deck = new Deck();
    public static void main(String[] args) {
        
        deck.shuffle();

        userDrawCard(user);
        userDrawCard(user);
        for(Card card: user.getHand()){
            System.out.println(card);
        }

        // end of program
        input.close();
    }
    public static void userDrawCard(Player user){
        user.hand.add(deck.getCard(0));
        deck.removeCard(0);
    }
}
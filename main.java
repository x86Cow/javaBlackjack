import java.util.Scanner;

/** 
 * @Title: Blackjack
 * @Author: Alexander Lorei
 * @Date: December 22, 2022
 */
class Main{
    static String inputResult;
    private static Scanner input = new Scanner(System.in);
    /*
    input.next() gets the next text up to a space
    input.nextLine() gets the next line (up to enter)
    input.nextInt()
    input.nextBool()
    input.nextChar()
    */
   private static Player user = new Player(100);
   private static Player dealer = new Player(100);
   private static Deck deck = new Deck();
   private static Card card = new Card();

    public static void main(String[] args) {
     do{
            deck.shuffle();

            user.addCard(deck.dealTopCard());
            user.addCard(deck.dealTopCard());
            printHand();

            String result = "hit";
            do{
                result = playerTurn(result);

                if(user.getChipsAmount() <= 0) {
                    System.out.println("You are out of chips!");
                    break;
                }
                if(user.getHandAmount(card) > 21) {
                    System.out.println("Bust!");
                    break;
                }
            } while(result.equals("hit"));

            // end of program
        } while(playAgainOption());
        input.close();
    }

    private static void printHand() {
        for(Card card: user.getHand()){
            System.out.println(card);

        }
    }
    
    /**
     * Asks player if they would like to play again
     * @return true or false (default is true)
     */
    private static boolean playAgainOption(){
        System.out.println("Play Again? Y/n");
        String result = input.nextLine().toLowerCase().trim();
        if (result.equals("n")) {
            return false;
        }
        return true;
    }
    /**
     * Creates a loop if a player hits so program does not exit. 
     * @param result
     * @return returns result of input again
     */
    private static String playerTurn(String result) {
        System.out.println("hit or stand");
        result = input.nextLine().toLowerCase().replaceAll(" ", "");
            switch(result){
                case "hit":
                    user.addCard(deck.dealTopCard());
                    printHand();
                    user.getHandAmount(card);
            }
        return result;
    }
}
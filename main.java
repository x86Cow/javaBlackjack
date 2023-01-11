import java.util.ArrayList;
import java.util.Scanner;

/** 
 * @Title: Blackjack
 * @Author: Alexander Lorei
 * @Date: December 22, 2022
 */
class Main{
    static String inputResult;
    private static final int defaultChips = 100;
    private static Scanner input = new Scanner(System.in);
    //private static Player user  = new Player();
    private static Player dealer = new Player();
    private static Deck deck = new Deck();
    private static Card card = new Card();
    private static ArrayList<Player> players = new ArrayList<Player>();
    public static void main(String[] args) {
        // clear hands off all users
        clearHand();

        System.out.println("How many players are there?");
        int numPlayers = -1;
        clearHands();
        do{
            try{
                numPlayers = Integer.parseInt(input.nextLine());

                if(numPlayers < 0 || numPlayers > 10){
                    numPlayers = -1;
                    System.out.println("Please try again");
                }
            } catch(Exception e){
                System.out.println("Please input a number");
            }  
        } while(numPlayers == -1);
        
        
        for(int i = 0; i < numPlayers; i++) {
            System.out.println("Player" + (i+1) + ", what's your name?");
            String tempName = input.nextLine().trim();
            tempName = tempName.substring(0, 1).toUpperCase() + tempName.substring(1);
            players.add(new Player(defaultChips, tempName));
        }


        int tempBetAmount = -1;
        do{
            for(Player p : players){
                String name = p.getName();
                System.out.println(name + " How many chips would you like to wager?");
                do {
                    try{
                        tempBetAmount = Integer.parseInt(input.nextLine());
                        if((tempBetAmount > p.getChipsAmount()) || (tempBetAmount < 0)){
                            System.out.println("Please input a number");
                            tempBetAmount = -1;
                        }
                    } catch(Exception e){
                        p.setBet(tempBetAmount);
                        }
                } while(tempBetAmount == -1);
            }
            //user.setBet(input.nextInt());
            deck.shuffle();

            // Deal two cards to all players
            for(Player p : players){
                p.addCard(deck.dealTopCard());
                p.addCard(deck.dealTopCard());
            }

            // print Dealer Hand();
            dealer.addCard(deck.dealTopCard());
            dealer.addCard(deck.dealTopCard());
            System.out.println("dealer hand: ");
            printDealerHand();
            System.out.println("Your hand is: ");

            for(Player p : players){
                printHand(p);
                playerTurn(p);
                dealerTurn();
            }

            // end of program
        } while(playAgainOption());
        
        input.close();

    }

    private static void printHand(Player p) {
        for(Card card: p.getHand()){
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
     * Asks player if they would like to hit or stand
     *
     * @param p player object to be used
     */
    private static void playerTurn(Player p) {
        String result;
        do {
            String name = p.getName();
            System.out.println(name + " would you like to Hit or Stand");

            result = input.nextLine().toLowerCase().replaceAll(" ", "");
            //result = result.substring(0, 1).toUpperCase() + result.substring(1);

            if(p.getHandAmount(card) > 21) {
                System.out.println("Bust");
                result = "stand";
            }
            switch(result){
                case "hit":
                    p.addCard(deck.dealTopCard());
                    System.out.println("Your hand is now: ");
                    printHand(p);
                    //user.getHandAmount(card);
                    break;
            }
        } while(!result.equals("stand"));
    }        
    private static void dealerTurn() {
        String result = "";
        int cardAmount = dealer.getHandAmount(card);
        do {
            if(cardAmount < 17){
                dealer.addCard(deck.dealTopCard());
                printDealerHand();
                cardAmount = dealer.getHandAmount(card);
            } else if(cardAmount > 21){
                System.out.println("Dealer busts");
                result = "stand";
            } else if(cardAmount == 21){
                System.out.println("Dealer has 21");
                result = "stand";
            } else {
                result = "stand";
            }
            if (result.equals("stand")) {}
                calculateWinner();
                System.out.println("Dealer hits");
            }
        } while(!result.equals("stand"));
    }
             
    // TODO: write double down
    private static void doubleDown(Player p) {
        // user.setBet(user.getBet() * 2);
        p.addCard(deck.dealTopCard());
    }        
    /**
     * Clears all hands of all players
     */
    private static void clearHand() {
        for(Player p : players){
            p.clearHand();
        }
    }
    private static void printDealerHand() {
        for(Card card: dealer.getHand()){
            System.out.println(card);
        }
    }
    private static void calculateWinner() {
        if(dealer.getHandAmount(card) > 21){
            for(Player p : players){
                if(p.getHandAmount(card) > 21){
                    // tie
                } else {
                    // player wins
                    System.out.println(p.getName() + " wins");

                }
            }
        } else {
            for(Player p : players){
                if(p.getHandAmount(card) > 21){
                    // dealer wins
                } else if(p.getHandAmount(card) > dealer.getHandAmount(card)){
                    // player wins
                } else if(p.getHandAmount(card) < dealer.getHandAmount(card)){
                    // dealer wins
                } else {
                    // tie
                }
            }
        }
    }
    private static void clearHands() {
        for(Player p : players){
            p.clearHand();
        }
        dealer.clearHand();
    }
}

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
    public static void main(String[] args) {
        player player1 = new player(100);
        System.out.println(player1.getChipsAmount());        
        

        // end of program
        input.close();
    }
}
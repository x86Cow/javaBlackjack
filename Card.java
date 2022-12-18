public class Card {
    private int suit, face;
    public Card(int suit, int face) {
        this.suit = suit;
        this.face = face;
    }
    public int getSuit() {
        return this.suit;
    }
    public int getFace() {
        return this.face;
    }
    public String toString() {
        String output = "";
        switch(this.getFace()) {
            case 13:
               if (this.getSuit() == 4) {
                output += "King of Hearts ";
                break;
               }
               else if(this.getSuit() == 3) {
                output += "King of Diamonds ";
               }
               else if(this.getSuit() == 2) {
                output += "King of Clubs ";
               }
               else if(this.getSuit() == 1) {
                output += "King of Spades ";
               }
               
            case 12:
               if (this.getSuit() == 4) {
                output += "Queen of Hearts ";
                break;
               }
               else if(this.getSuit() == 3) {
                output += "Queen of Diamonds ";
               }
               else if(this.getSuit() == 2) {
                output += "Queen of Clubs ";
               }
               else if(this.getSuit() == 1) {
                output += "Queen of Spades ";
               }
            case 11:
               if (this.getSuit() == 4) {
                output += "Jack of Hearts ";
                break;
               }
               else if(this.getSuit() == 3) {
                output += "Jack of Diamonds ";
               }
               else if(this.getSuit() == 2) {
                output += "Jack of Clubs ";
               }
               else if(this.getSuit() == 1) {
                output += "Jack of Spades ";
               }
            case 10:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of Hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() +" of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() +" of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() +" of Spades";
                break;
               }
            case 9:
               if (this.getSuit() == 4) {
                output += this.getFace()  + " of hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Spades";
                break;
               }
            case 8:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of Hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Spaces";
                break;
               }
            case 7:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of Hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Hearts";
                break;
               }
            case 6:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Hearts";
                break;
               }
            case 5:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Hearts";
                break;
               }
            case 4:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Hearts";
                break;
               }
            case 3:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of Hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Spades";
                break;
               }
            case 2:
               if (this.getSuit() == 4) {
                output += this.getFace() + " of Hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += this.getFace() + " of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += this.getFace() + " of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += this.getFace() + " of Spades";
                break;
               }
            case 1:
               if (this.getSuit() == 4) {
                output += "ace of " + "Hearts";
                break;
               }
               if (this.getSuit() == 3) {
                output += "Ace of Diamonds";
                break;
               }
               if (this.getSuit() == 2) {
                output += "Ace of Clubs";
                break;
               }
               if (this.getSuit() == 1) {
                output += "Ace of Spades";
                break;
               }
        }

        return output;
    }
}

/**
 @Feroz Naeem
 */
package coe318.lab5;
public class Card implements Comparable {
  
    //Symbolic constants
    public static final int CLUB = 0;
    public static final int DIAMOND = 1;
    public static final int HEART = 2;
    public static final int SPADE = 3;
    
    int suit, rank; 
        boolean faceUp;
  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 10. Numbered cards (2 to 10)
   * have a value equal to their number. Jack, Queen, King have the value of 10
   * Ace in this version will only be the value of 1. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
    public Card(int rank, int suit, boolean faceUp) {
        this.rank = rank; 
            this.suit= suit; 
                this.faceUp = faceUp; 
  }

  /**
   * @return the faceUp
   */
    public boolean isFaceUp() {
        return faceUp; 
  }

  /**
   * @param faceUp the faceUp to set
   */
    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp; 
  }

  /**
   * @return the rank
   */
    public int getRank() {
        return this.rank; 
  }

  /**
   * @return the suit
   */
    public int getSuit() {
        return suit;
  }

    @Override
    public boolean equals(Object ob) {
        boolean canEqual = false; 
        if (!(ob instanceof Card)) {
            return false;
        }
        
        Card c = (Card) ob;
        if (c.suit== this.suit && this.rank == c.rank) { 
            canEqual = true; 
    } 
    return canEqual; 
  }

    @Override
    public int hashCode() {
        int hash = 7;
            hash = 31 * hash + this.getRank();
        hash = 31 * hash + this.getSuit();
    return hash;
  }

    @Override
    public int compareTo(Object obj) {
        return compareTo((Card) obj);
    }

    public int compareTo(Card c) { 

        if(this.rank==c.rank){
            return (suit-c.suit); 
        }
      
        else {
            return(rank-c.rank);
        }
    }
    
    public int callCard(){
        int rankz = 0; 
            if (this.getRank()==14){
                return 1;
            } 
            
            else if (this.getRank() > 10){
                return 10;
            }
            
            else { 
                rankz= this.getRank(); 
            }
      return rankz; 
      }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
    public String getRankString() {
        switch(this.rank){
    
    case 11: 
        return( "The Card is Jack");
    
    case 12: 
        return("The Card is Queen");
    
    case 13: 
        return("The Card is King");
    
    case 14: 
        return("The Card is Ace");
    }
        
    return (rank + "");
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
    public String getSuitString() {
        if (this.suit == 0) {
            return "club";
        }
        if (this.suit == 1) {
            return "diamond";
        }
        if (this.suit == 2) {
            return "heart";
        }
        if (this.suit == 3) {
            return "spade";
        }
     
    return ("\n"+ this.suit);
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
    @Override
    public String toString() {
        if(this.faceUp){
            return(this.getRankString() + " of " + this.getSuitString() + "\n");
        } 
    
        else {
            return("?");
        }
    }

    //Create 5 of clubs
    public static void main(String[] args) {
        Card club5 = new Card(5, 0, true);
            System.out.println("club5: " + club5);
        
        Card spadeAce = new Card(14, SPADE, true);
            System.out.println("spadeAce: " + spadeAce);
        System.out.println("club5 compareTo spadeAce: " + club5.compareTo(spadeAce));
            System.out.println("club5 compareTo club5: " + club5.compareTo(club5));
        System.out.println("club5 equals spadeAce: " + club5.equals(spadeAce));
            System.out.println("club5 equals club5: " + club5.equals(club5));
  }
}
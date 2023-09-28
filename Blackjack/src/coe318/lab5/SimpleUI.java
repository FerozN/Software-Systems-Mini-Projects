/**
 @Feroz Naeem
 */
package coe318.lab5;
    import java.util.Scanner;

public class SimpleUI implements UserInterface {
    
    private BlackjackGame game;
        private Scanner user = new Scanner(System.in);

    @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }
    
    @Override
    public void display() {
        System.out.println("Houses Cards"); //FIX THIS
            System.out.println(this.game.getHouseCards() + "\n");            
                System.out.println("Your Cards"); 
        System.out.println(this.game.getYourCards()+ "\n");            
    }

     // returns true if user wishes for a card else false 
    @Override
    public boolean hitMe() {
        System.out.println("Would you like a Card (Y/N)"); 
            String input = user.nextLine();
                boolean hit = true; 
        switch(input){
            case  "Y": 
                hit = true; 
        break; 
            case "N":
                hit= false; 
        break; 
        default: 
        
        System.out.println("Incorrect input");
            hitMe();
      }
      return hit; 
    }


    @Override
    public void gameOver() {
        int houseScore, yourScore;
        
        houseScore = game.score(game.getHouseCards());
            yourScore = game.score(game.getYourCards());
            
        System.out.println("HOUSE CARDS: " + game.getHouseCards().toString());
            System.out.println("HOUSE SUM: " + houseScore);
        System.out.println("YOUR CARDS: " + game.getYourCards().toString());
            System.out.println("YOUR SUM: " + yourScore);
            
        boolean winner = false;
        if (yourScore > 21 || yourScore == houseScore) {
            winner = false;
                System.out.println("You lost.");
        } 
        
        else if (yourScore < 21 && houseScore < 21) {
            if (yourScore > houseScore) {
                winner = true;
                    System.out.println("You win!");
            } 
            
            else {
                winner = false;
                    System.out.println("You lost.");
            }
        } 
        
        else {
            winner = true;
                System.out.println("You win!");
        }
    }
}
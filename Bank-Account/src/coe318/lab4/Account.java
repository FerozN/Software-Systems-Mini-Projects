/**
 @Feroz Naeem
 */

package coe318.lab4;
public class Account {
    
    String name;
        int num;
    double iBal;
    
    public Account(String name, int number, double initialBalance) {
        this.name=name;
            num=number;
                iBal = initialBalance;
    }    
    
    //if name is applicable return name if not return null
     public String getName(){
         return name;
    }  

    //gets the balance and balance cant be in the negatives
     public double getBalance(){
        return iBal;
    }  
    
    public int getNumber(){
        return num;
    }   
    
    // A deposit can fail if the amount is negative or zero
    public boolean deposit(double amount){ 
        
       if (amount <= 0){
           return false;
       }
        else
           iBal = iBal + amount; 
        return true;
    }   
    
    //withdraw can fail if the balance is not big enough or if an attempt is made to withdraw zero or a negative value
    public boolean withdraw(double amount){
        
        if (amount <= 0 || amount > getBalance()){
          return false;  
        } 
        
        else 
            iBal = iBal - amount;
                return true;
    }    
    
    @Override
    public String toString() {
        return "(" + getName() + ", " + getNumber() + ", " +
            String.format("$%.2f", getBalance()) + ")";
    }
}

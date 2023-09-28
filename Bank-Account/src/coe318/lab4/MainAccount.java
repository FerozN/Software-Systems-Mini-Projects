/**
 @Feroz Naeem
 */

package coe318.lab4; 
public class MainAccount {

    public static void main(String[] args) {
        Account alice = new Account("Alice", 123, 100.00);
            Account bob = new Account("Bob", 789, 0);
        
        System.out.println(bob);
            System.out.println(alice);

        alice.withdraw(15);//bal = 85
            System.out.println(alice);
        alice.withdraw(200);//can't do so bal is still 85
            System.out.println(alice);
        alice.withdraw(-1);//can't do so bal is still 85
            System.out.println(alice);
        alice.deposit(150); //bal is now 85+150 
            alice.withdraw(200); //ball is now 85-50 so 35
        System.out.println(alice);
            bob.deposit(300);//bob bal is now 300
        System.out.println(bob);
            bob.withdraw(100);//bob bal is now 200
        System.out.println(bob);
    }

}





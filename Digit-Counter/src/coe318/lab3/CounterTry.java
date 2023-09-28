/**
 @Feroz Naeem
 */

package coe318.lab3;
public class CounterTry {
    
    public static void main(String[] args) {
        Counter d1, d0;
            d0 = new Counter(3, null);
        
        for (int i = 0; i < 4; i++) {
            System.out.println("d0 = " + d0);
                d0.increment();
        }
        
        System.out.println("\nTwo digit counter...");
            d1 = new Counter(4, null);
                d0 = new Counter(4, d1);
        
        for (int i = 0; i < 10; i++) {
            System.out.println("d1, d2 digits: " +
                    d1.getDigit() + d0.getDigit() + " d0 count = " + d0);
            d0.increment();
        }
    }
}
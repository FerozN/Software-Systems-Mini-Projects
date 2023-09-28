/**
 @Feroz Naeem
 */

package coe318.lab3;
public class Counter {
    
    //counter is a special type of variable where it will alwas be an int number
    Counter left;
        int digit;
    int modulus;
    
    //Instance variables here
    public Counter(int modulus, Counter left) {
        this.modulus = modulus;
            this.left = left; 
    }

    public int getModulus() {
        return modulus;
    }

    public Counter getLeft() {
        if (left == null){ 
            return null; 
        }
        else {
            return left; 
        }
    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void setDigit(int digit) {
        this.digit = digit;
        
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    
    //returns d1, d2 digit increment 
    public void increment() {
        setDigit(getDigit()+1);
 
        if (getDigit() == getModulus()){
            setDigit(0);
        } 
      
       if (getLeft() != null && getDigit() == 0){
           getLeft().increment();     
        }   
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    
    //returns d0 count
    public int getCount() { // EX. 10 in base 3, d1 = 1, d0 = 0, d0.getCount, output should be 1 x 3^1 = 3

        if (getLeft() == null){
            return getDigit();            
        } 
        
        else 
            return getDigit()+getModulus()*getLeft().getCount();
    }

    /** Returns a String representation of the Counter's
     * total count (including its left neighbor).
     * @return the String representation
     */
    @Override
    public String toString() {
        return "" + getCount();
    }

}


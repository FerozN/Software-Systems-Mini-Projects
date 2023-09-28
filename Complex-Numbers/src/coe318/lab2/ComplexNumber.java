/**
 @Feroz Naeem
 */

package coe318.lab2;
public class ComplexNumber {

     double re;
        double im;

    public ComplexNumber(double re, double im) {    
        this.re = re;
            this.im = im; 
    }
    
    public double getReal() { 
        return re;	
    }

    public double getImaginary() {
        return im;	
    }

    //Returns the (-1) value of the statement
    public ComplexNumber negate() { 
        
        ComplexNumber b;
            b= new ComplexNumber (re*-1,im*-1);
        return b;
    }


    //Returns the complex# that's been added together
    public ComplexNumber add(ComplexNumber z) { 
    
        ComplexNumber d;
            d = new ComplexNumber(this.re + z.getReal(),this.im + z.getImaginary());
        return d;	
    }

    //Returns the complex# that's been subtracted together
    public ComplexNumber subtract(ComplexNumber z) { 
        
        ComplexNumber e;
            e = new ComplexNumber(this.re - z.getReal(), this.im - z.getImaginary());
        return e;	
    }
    
    //Returns the complex# that's been multiply together
    public ComplexNumber multiply(ComplexNumber z) { 
        
        ComplexNumber h;
            h = new ComplexNumber(this.re * z.getReal() + -1*this.im * z.getImaginary(), //real
                this.re*z.getImaginary() + this.im*z.getReal()); //imaginary
        return h;
    }

    //Returns the complex# that's been swap together
    public ComplexNumber reciprocal() { 

        ComplexNumber g;
            g = new ComplexNumber(this.re/(this.re*this.re-this.im*this.im*-1), //numerator
                -1*this.im/(this.re*this.re-this.im*this.im*-1)); //denominator
        return g;	
    }

    //Returns the complex# that's been divide together
    public ComplexNumber divide(ComplexNumber z) { 
       
        ComplexNumber f;
            f = new ComplexNumber(
                (this.re * z.getReal() + this.im * z.getImaginary()) //real numerator
                        /(z.getReal()*z.getReal()+z.getImaginary()*z.getImaginary()), //real denominator
                (this.im*z.getReal()-this.re*z.getImaginary()) // imaginary numerator
                        /(z.getReal()*z.getReal()+z.getImaginary()*z.getImaginary()) //imaginary denominator
        );
        return f;	
    }

    @Override
    public String toString() {

        String str = "" + this.getReal();
        if (this.getImaginary() == 0.0) {
            return str;
        }
        if (this.getImaginary() > 0) {
            return str + " + i" + this.getImaginary();
        } else {
            return str + " - i" + -this.getImaginary();
        }
    }
}

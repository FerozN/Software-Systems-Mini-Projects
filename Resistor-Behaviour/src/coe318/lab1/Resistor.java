
package coe318.lab1;

public class Resistor {

private double R;
private double V;

public Resistor(double resistance) {
//Set values of state variables
  
    R = resistance;
}


public double getResistance() {

    return R;
}

public double getVoltage() {
    return (V);

}


public void setVoltage(double voltage) {
//Only set the voltage value if the parameter is between 50 and -50, otherwise print an error message.

    if (voltage >= -50 && voltage <= 50) {    
        V = voltage;    
    }
    
    else System.out.println("Error: current value beyond limit\n");
}

public double getCurrent() {
    
    return (V/R);

}

public void setCurrent(double current) {
//set the current value if the parameter is between 5 and -5, otherwise print an error message.

    if (current >= -5 && current <= 5) { 
        V = R*current;
    }
    
    else System.out.println("Error: current value beyond limit\n");
}

public double getPower() {
    return (V*V)/R;
}

public static void main(String[] args) {
    Resistor r1, r2;
    
    System.out.println("Creating a 50 Ohm resistor (r1)");
    r1 = new Resistor(50.0);
    System.out.println("Its resistance is " + r1.getResistance() + " Ohms");
    System.out.println("Its current is " + r1.getCurrent() + " Amps");
    System.out.println("Its voltage is " + r1.getVoltage() + " Volts");
    System.out.println("Its power is " + r1.getPower() + " Watts\n");
    System.out.println("Creating a 100 Ohm resistor (r2)");
    
    r2 = new Resistor(100.0);
    System.out.println("Its resistance is " + r2.getResistance() + " Ohms\n");
    System.out.println("Setting r1's current to 10 Amps");
    
    r1.setCurrent(10.0);
    System.out.println("Setting r1's current to 2 Amps");
    
    r1.setCurrent(2.0);
    System.out.println("Its current is " + r1.getCurrent() + " Amps");
    
    System.out.println("Its voltage is " + r1.getVoltage() + " Volts");
    System.out.println("Its power is " + r1.getPower() + " Watts\n");
    System.out.println("Setting r1's voltage to 90 Volts");
    
    r1.setVoltage(90.0);
    System.out.println("Setting r1's voltage to 50 Volts");
    
    r1.setVoltage(50.0);
    System.out.println("Its current is " + r1.getCurrent() + " Amps\n");
    System.out.println("Setting r2's current to 3 Amps");
    
    r2.setCurrent(3.0);
    System.out.println("Its voltage is " + r2.getVoltage() + " Volts");
    }
}

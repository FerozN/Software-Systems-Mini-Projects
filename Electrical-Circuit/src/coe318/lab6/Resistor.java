/**
 @Feroz Naeem
 */
package coe318.lab6;
public class Resistor {
    
    public double resistance;
        public Node node1;
    public Node node2;
        public int resID;
    private static int resCount = 1;
    
    public Resistor(double resistance, Node node1, Node node2){ 
        
        if(resistance < 0){
            throw new IllegalArgumentException("Resitances cannot be negative.");}
        
        if(node1 == null && node2 == null){
            throw new IllegalArgumentException("The connecting nodes must both exist. (Null Error)");}
        
        this.resistance = resistance;
            this.node1 = node1;
        this.node2 = node2;
            this.resID = resCount; 
        resCount++; 
        
        Circuit.getInstance().add(this); 
//Circuit.getInstance() is the instance variable of the circuit
//add is the method which adds circuit instance variable to 'this'
//this refers to the ressitor variable thats being constructed
    }
 
    public Node[] getNodes(){
        Node[] nodes = {node1, node2};
            return nodes;
    }
    
    @Override
    public String toString(){
        return("R"+resID + " " + node1 + " " + node2 + " " + resistance);
    }
    
}
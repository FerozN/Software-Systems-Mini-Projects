/**
 @Feroz Naeem
 */
package coe318.lab6;
    import java.util.ArrayList;

public class Circuit {
    
    ArrayList<Resistor> resistors;
        private static Circuit instance =  null;
    
    public static Circuit getInstance(){
        if(instance == null){
            instance = new Circuit();
        }
        return instance;
    }
    
    private Circuit(){ 
        resistors = new ArrayList<Resistor>();
    }
    
    public void add(Resistor r){
        this.resistors.add(r);
    }
    
    @Override
    public String toString(){
        String circuit = new String();
        
        for(int i = 0; i < resistors.size(); i++){
            circuit += resistors.get(i).toString() + "\n";
        }
        return(circuit);
    }
}
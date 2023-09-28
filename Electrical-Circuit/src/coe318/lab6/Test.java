/**
 @Feroz Naeem
 */
package coe318.lab6;
public class Test {
     
    public static void main(String[] args) {
        Circuit cir = Circuit.getInstance();
        
        Node A = new Node();
            Node B = new Node();
        Node C = new Node();
        
        System.out.println(A.toString());
            System.out.println(B.toString());
        System.out.println(C.toString());

        Resistor r1 = new Resistor(10.0, A, B);
            Resistor r2 = new Resistor(12.0, B, C);
            
        System.out.println(r1.toString());
            System.out.println(r2.toString());
        System.out.println("\nCircuit");
            System.out.println(cir.toString());
    }
}

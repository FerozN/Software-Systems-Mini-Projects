/**
 @Feroz Naeem
 */
package coe318.lab6;
public class Node {
    
    private int nodeID;
        private static int node_count = 0; 
     
    public Node(){
        nodeID = node_count;
            node_count++;
    }
   
    @Override
    public String toString(){
        return("" + this.nodeID);
    }
    
}
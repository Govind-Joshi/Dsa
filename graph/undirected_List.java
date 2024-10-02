// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Graph {
    LinkedList<List<Integer>> ll;
    int E;
    int V;
    
    public Graph(int node){
         this.ll = new LinkedList<>();;
        this.V = node;
        this.E = 0;
        for(int i=0;i<V;i++){
            ll.add(new LinkedList<Integer>());
        }
        
            }
    
    
    
    public void insert_Edege(int u,int v){
        // adj[u][v] = 1;
        // adj[v][u]  = 1;
        ll.get(u).add(v);
        ll.get(v).add(u);
        E++;
        
    }
    
    
    public void print(){
    //  StringBuffer s1 = new StringBuffer();
        System.out.print("total Edeg is"+E+"total vertex is"+V+"\n");
        for(int i =0;i<V;i++){
              System.out.print(i +" =>");
          for(int e : ll.get(i)){
              System.out.print( e+" =>");
          }
          System.out.print("\n");   
        }
      
        
      
        
        
     }
    
    
    
    public static void main(String[] args) {
   Graph gg = new Graph(4);
   gg.insert_Edege(0,1);
     gg.insert_Edege(1,2);
       gg.insert_Edege(2,3);
         gg.insert_Edege(3,0);
          // gg.insert_Edege(4,0);
         gg.print();  
    }
}
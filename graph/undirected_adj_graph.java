// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Graph {
    int [][]adj;
    int E;
    int V;
    
    public Graph(int node){
        this.adj = new int[node][node];
        this.V = node;
        this.E = 0;
            }
    
    
    
    public void insert_Edege(int u,int v){
        adj[u][v] = 1;
        adj[v][u]  = 1;
        E++;
        
    }
    
    
    public void print(){
    //  StringBuffer s1 = new StringBuffer();
        System.out.print("total Edeg is"+E+"total vertex is"+V+"\n");
        for(int i =0;i<V;i++){
           for(int e : adj[i]){
              System.out.print(e+" =>");
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
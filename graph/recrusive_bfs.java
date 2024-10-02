// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Graph {
    LinkedList<List<Integer>> ll;
    //  LinkedList<List<Integer>> ll2;
    int E;
    int V;
    boolean [] chk;
    
    public Graph(int node){
         this.ll = new LinkedList<>();;
        this.V = node;
        this.E = 0;
        this.chk = new boolean[V];
        for(int i=0;i<V;i++){
            ll.add(new LinkedList<Integer>());
                // ll2.add(new LinkedList<Integer>());
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
     
     
     public  void bfs(int s){
         Queue<Integer> qq = new LinkedList();
         qq.offer(s);
         chk[s] = true;
         while(!qq.isEmpty()){
            int ss =  qq.poll();
          System.out.print(ss+"=>");
          for(int n:ll.get(ss)){
             if(!chk[n]){
                chk[n] = true;
                qq.offer(n);
             } 
          }
             
         }
         
         
         
         
         
         
     }
    
    
    public void dfs(int s){
        Stack<Integer> ss = new Stack<>();
        ss.push(s);
        while(!ss.isEmpty()){
         int hold =   ss.pop();
         if(!chk[hold]){
              chk[hold] = true;
             System.out.print(hold+"<=>");
             for(int h:ll.get(hold)){
                 if(!chk[h]){
                   //  chk[h] = true;
                     ss.push(h);
                 }
                 
             }
             
         }
           
            
        }
        
        
        
    }
    
    
    
    public void dfs_recrusive(){
       for(int i=0;i<V;i++){
       if(!chk[i]){
           
           dfs_r(i);
       }
        
      
       }  
        
        
    }
    
    public void dfs_r(int i){
     chk[i] = true;
     System.out.print(i+"<=>");
     for(int n:ll.get(i)){
         if(!chk[n]){
             dfs_r(n);
         }
     }
        
    }
    //0<=>3<=>4<=>2<=>1<=> 
    
    
   
    public void bfs_recrusive() {
        for (int i = 0; i < V; i++) {
            if (!chk[i]) {
                // Start recursive BFS from node `i`
                bfs_r(new LinkedList<>(Arrays.asList(i)));
            }
        }
    }

    // Adjusted recursive BFS helper method
    public void bfs_r(LinkedList<Integer> currentLevel) {
        if (currentLevel.isEmpty()) return; // Base case

        LinkedList<Integer> nextLevel = new LinkedList<>();
        for (int node : currentLevel) {
            chk[node] = true;
            System.out.print(node + " => ");
            
            // Process all neighbors
            for (int neighbor : ll.get(node)) {
                if (!chk[neighbor]) {
                    System.out.print(neighbor + " ");
                    chk[neighbor] = true;
                    nextLevel.add(neighbor);
                }
            }
            System.out.println();
        }

        // Recursively call BFS on the next level
        bfs_r(nextLevel);
    }
  
   // public void print
    //with queue..
     public void bfs_recrusive(int start) {
        Queue<Integer> qq = new LinkedList<>();
        qq.offer(start);
        chk[start] = true;
        bfs_r(qq);
    }

    public void bfs_r(Queue<Integer> qq) {
        if (qq.isEmpty()) return;

        int node = qq.poll();
        System.out.print(node + "=>");

        // Process all neighbors
        for (int neighbor : ll.get(node)) {
            if (!chk[neighbor]) {
                chk[neighbor] = true;
                qq.offer(neighbor);
            }
        }

        // Recur for the next element in the queue
        bfs_r(qq);
    }
    
    
    

    
    public static void main(String[] args) {
   Graph gg = new Graph(5);
   gg.insert_Edege(0,1);
     gg.insert_Edege(1,2);
       gg.insert_Edege(2,3);
         gg.insert_Edege(3,0);
         gg.insert_Edege(2,4);
          // gg.insert_Edege(4,0);
       //  gg.print();
       gg.bfs_recrusive();
    }
}
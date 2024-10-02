// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Graph {
    LinkedList<List<Integer>> ll;
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
    
    
    
    public void dfs_recrusive(int s){
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
    
    public static void main(String[] args) {
   Graph gg = new Graph(5);
   gg.insert_Edege(0,1);
     gg.insert_Edege(1,2);
       gg.insert_Edege(2,3);
         gg.insert_Edege(3,0);
         gg.insert_Edege(2,4);
          // gg.insert_Edege(4,0);
       //  gg.print();
       gg.dfs_recrusive(0);
    }
}
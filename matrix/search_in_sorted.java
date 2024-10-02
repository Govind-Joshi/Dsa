// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BineryTree {
    // TreeNode root;
    // class TreeNode{
        
    //     public TreeNode(){
            
            
            
    //     }
    // }
    public void search_in_sorted(int size,int x,int[][]a){
       int j = size-1;
       int i = 0;
       while(j>=0 && i<size){
           
           if(a[i][j]==x){
               System.out.print("found in "+a[i][j]);
               return;
           }
           if(a[i][j]>x){
               j--;
           }
           else{
               i++;
           }
           
           
           
           
       }
       System.out.print("not found..");
        
        
        
    }
    
    
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
    int [][] a = {
        {10,20,30,40},
        {25,35,45,65},
        {27,36,46,66},
        {28,37,47,67}
        
    } ;  
   BineryTree bb = new BineryTree();
   bb.search_in_sorted(a[0].length,39,a);
   
        
    }
}
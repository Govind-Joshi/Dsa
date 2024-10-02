// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public int[] reversearray(int [] a){
  int [] arr = new int[a.length];
  int c =0;
  for(int i=a.length-1;i>=0;i--){
      arr[c++] = a[i];
  }
  
  
        return arr;
        
    }
    
    
    
    public void printarray(int [] a){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        HelloWorld h  = new HelloWorld();
        int [] i = {1,2,4,5,6,7,8};
      int [] hold =   h.reversearray(i);
      h.printarray(hold);
  
    }
}
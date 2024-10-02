// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
public boolean plidrom(String s){
    int i =0;
    int j = s.length()-1;
    while(i<=j){
     if(s.charAt(i)!=s.charAt(j))return false;
     i++;
     j--;
    }
    return true;
}



  
    
    






    
    public void printarray(int [] a){
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        HelloWorld h  = new HelloWorld();
        int [] i = {1,2,4,6,5,3,8};
        String s = "papi";
      boolean  hold =   h.plidrom(s);
      System.out.print(hold);
    //   h.printarray(hold);
  
    }
}
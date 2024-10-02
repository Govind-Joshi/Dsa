// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public  int[] moveallzero(int [] a){
  int []arr = new int[a.length];
  int c= 0;
  for(int i =0;i<a.length;i++){
      if(a[i]!=0){
          arr[c++] = a[i];
      }
      }
   return arr;   
  }

  
  
    
    
//seco=nd method without taking extra space
   public  int[] moveallzero1(int [] a){

  int j= 0;
  for(int i =0;i<a.length;i++){
     if(a[i]!=0 && a[j]==0){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
     }
    if(a[j]!=0){
         j++;
     }
      }
   return a;   
  }



    
    public void printarray(int [] a){
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        HelloWorld h  = new HelloWorld();
        int [] i = {1,2,4,5,0,0,6,7,8,0,0,50,55,90,40,500};
      int []  hold =   h.moveallzero1(i);
    //   System.out.print(hold);
      h.printarray(hold);
  
    }
}
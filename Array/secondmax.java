// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public int seconmax(int [] a){
int first=a[0];
int second = a[0];
for(int i =0;i<a.length;i++){
  if(first<a[i]){
     second =  first;
     first = a[i];
     
  }else if(a[i]<first && a[i]>second){
      
     second = a[i]; 
      
  }

  }
  
      return second;
    
    
}



    
    
    
    //   public int[] removodd(int [] a){
    //     int count = 0;
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]%2==0){
    //             count++;
    //         }
            
    //     }
    // int [] arr = new int[count];
    // int j = 0;
    // for(int i =0;i<a.length;i++){
    //       if(a[i]%2==0){
    //          arr[j] = a[i];
    //          j++;
    //         }
    // }
    //     return arr;
        
    // }
    
    public void printarray(int [] a){
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        HelloWorld h  = new HelloWorld();
        int [] i = {1,2,4,5,6,7,8,50,55,90,40,500};
      int  hold =   h.seconmax(i);
      System.out.print(hold);
    //   h.printarray(hold);
  
    }
}
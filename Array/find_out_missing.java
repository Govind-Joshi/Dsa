// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public  int find_missing_number(int [] a){
int [] arr = new int[a.length+1];
for(int i =0;i<a.length;i++){
    arr[a[i]-1] = a[i]; 
}
for(int j = 0;j<arr.length;j++){
    if(arr[j]==0)return j+1;
}
   return 0;   
  }


// second method more optimize for space...
  public int find_missing_number(int[] a) {
    int n = a.length + 1; 
    int expectedSum = n * (n + 1) / 2;  numbers.
    
    int actualSum = 0;
    for (int num : a) {
        actualSum += num;
    }
    

    return expectedSum - actualSum;
}

  
    
    






    
    public void printarray(int [] a){
        for(int i =0;i<a.length;i++){
            System.out.println(a[i]);
        }
        
        
    }
    
    
    public static void main(String[] args) {
        HelloWorld h  = new HelloWorld();
        int [] i = {1,2,4,6,5,3,8};
      int  hold =   h.find_missing_number(i);
      System.out.print(hold);
    //   h.printarray(hold);
  
    }
}
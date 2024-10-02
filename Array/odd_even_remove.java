// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    public int[] removeeven(int [] a){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){
                count++;
            }
            
        }
    int [] arr = new int[count];
    int j = 0;
    for(int i =0;i<a.length;i++){
          if(a[i]%2!=0){
             arr[j] = a[i];
             j++;
            }
    }
        return arr;
        
    }
    
    
    
       public int[] removodd(int [] a){
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
            
        }
    int [] arr = new int[count];
    int j = 0;
    for(int i =0;i<a.length;i++){
          if(a[i]%2==0){
             arr[j] = a[i];
             j++;
            }
    }
        return arr;
        
    }
    
    
    
    public static void main(String[] args) {
        HelloWorld h  = new HelloWorld();
        int [] i = {1,2,4,5,6,7,8};
      int [] hold =   h.removeeven(i);
      int [] hold2 = h.removodd(i);
        System.out.println(hold[hold.length-1]+" "+hold.length+hold2.length);
    }
}
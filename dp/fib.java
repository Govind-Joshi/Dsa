// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Dp{
   
    
    //SIMPLE METHOD WITHOUT DP..n*n
    public int fib(int n){
        if(n==0)return 0;
        if(n==1)return 1;
        return fib(n-1)+fib(n-2);
    }
    
    
    // DP TOP TO DOWN O(n)
        public int Tfib(int n,int [] arr){
        if(n==0)return 0;
        if(n==1)return 1;
        if(arr[n]!=0)return arr[n];
        return arr[n]=Tfib(n-1,arr)+Tfib(n-2,arr);
    }
    
    
    // Dp bottem to up O(n)
            public int Bfib(int n,int [] arr){
      arr[0] = 0;
      arr[1] = 1;
      for(int i = 2;i<=n;i++){
      arr[i] = arr[i-1]+arr[i-2];    
      
    }
    return arr[n];
}
    public static void main(String[] args) {
        
        Dp dd = new Dp();
        int n = 150;
         int [] arr = new int[n+1];
         int hold = dd.Tfib(n,arr);
            int hold = dd.fib(n);
             int hold = dd.Bfib(6,arr);
        System.out.println("==>"+hold);
    }
}
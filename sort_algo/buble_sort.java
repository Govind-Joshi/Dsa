      public void buble(int [] arr){
        int n = arr.length;
        
    for(int i =1;i<n;i++){
      boolean iswap = false;
      for(int j = 0;j<=n-1-i;j++){
          if(arr[j]>arr[j+1]){
              int temp = arr[j];
              arr[j] =arr[j+1];
              arr[j+1] = temp;
              iswap = true;
          }
          
      }
 if(!iswap)break;
      
       
        
    }  
        
      }
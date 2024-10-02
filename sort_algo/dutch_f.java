   public  void dutch_f(int [] arr){
       int i =0;
  
       int k = arr.length-1;
       int n = 0;
       while(i<=k){
           if(arr[i]==0){
               int temp = arr[i];
               arr[i] = arr[n];
               arr[n] = temp;
               n++;
           }
              else if(arr[i]==1){
                 i++;
           }
           else if(arr[i]==2){
              int temp =  arr[i];
              arr[i] = arr[k];
              arr[k] = temp;
              k--;
           }
       
       }
       
   }
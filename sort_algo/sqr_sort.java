// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Merge {
    

        
 
   

   
   
   
   public int [] sorted_arr_sqr_sort(int [] arr){
    int i =0;
    int j =arr.length-1;
    int [] temp = new int[arr.length];
    int k = arr.length-1;
    while(i<=j){
        if(arr[i]>arr[j]){
            temp[k] =arr[i]; 
            i++;
        }else{
          temp[k]  = arr[j];
            j--;
            
        }
        --;
  
    }
    return temp;
       
   }
   
   
   
   

   
   
   public int [] sqr(int [] arr){
       
       for(int i =0;i<arr.length;i++){
           arr[i] = arr[i]*arr[i];
       }
       return arr;
       
       
   }
   
   
    
    
    public void print(int [] arr){
        
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
        
    }
    
    
    
    
    public static void main(String[] args) {
        Merge mm = new Merge();
    
      
         int [] arr2 ={-9,-6,-1,3,5,7,8};
        // mm.dutch_f(arr2);
        
    int [] sqr = mm.sqr(arr2);  
     mm.print(sqr);
     
    int [] hold =   mm.sorted_arr_sqr_sort(sqr);
        mm.print(hold);
        

    }
}
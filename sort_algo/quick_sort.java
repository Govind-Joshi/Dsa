// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Merge {
    

        

   
   
   public void quick(int [] arr,int low,int high){
       if(low<high){
    int p =  parition(arr,low,high);
     quick(arr,low,p-1);
     quick(arr,p+1,high);

       }
   }
   

   
   
   
   
   
   public int parition(int [] arr,int low,int high){
   int pivot = arr[high];
   int i = low;
   int j = low;
   while(i<=high){
       if(arr[i]<=pivot){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
        j++;   
       }
       i++;
   }
  return  j-1;
       
   }
   
   
   
   
   
    
    
    public void print(int [] arr){
        
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
    
    
    
    public static void main(String[] args) {
        Merge mm = new Merge();
        int [] arr ={5,2,7,6,8,9,1,7,0};
        int high = arr.length-1;
        int low = 0;
        int [] temp = new int[arr.length];
        mm.quick(arr,low,high);
        //  int [] arr2 ={2,0,2,1,0,2,1,2,0};
        // mm.dutch_f(arr2);
        mm.print(arr);
        

    }
}
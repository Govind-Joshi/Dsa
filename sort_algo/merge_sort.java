// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Merge {
    
    public void sort(int [] arr, int []temp,int low,int high){
        if(low<high){
          int mid  = low+(high-low)/2;
          sort(arr,temp,low,mid);
          sort(arr,temp,mid+1,high);
        merge(arr,temp,low,high,mid);
            
        }
        
    }
        
        public void merge(int [] arr,int [] temp, int low,int high,int midd){
         for(int i =low;i<=high;i++){
             temp[i] = arr[i];
         }
         int mid = low+(high-low)/2;
       int i =low;
       int j = mid+1;
       int k=low;  
        while(i<=mid && j<=high){
            if(temp[i]>temp[j]){
                arr[k] = temp[j];
                j++;
                
            }
            else{
             arr[k] = temp[i];
             i++;
                
            }
            k++;
            
        }
        
   while(i<=mid){
       arr[k] = temp[i];
       k++;
       i++;
   }
            
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
        mm.sort(arr,temp,low,high);
        mm.print(arr);
        

    }
}
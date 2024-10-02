// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    
    // public void insertion(int [] arr){
    //     int n = arr.length;
        
    // for(int i =0;i<n-1;i++){
    //     int min  = i;
    //     for(int j=i+1;j<n;j++){
    //         if(arr[j]<arr[min]){
    //             int temp = arr[j];
    //             arr[j] = arr[min];
    //             arr[min] = temp;
                
    //         }
            
    //     }
       
        
    // }    
        
        
        
    // }







    public void insertionSort(int[] arr) {
    int n = arr.length;
    
    for (int i = 1; i < n; i++) {
        int temp = arr[i];  // The element we want to insert in the sorted part
        int j = i - 1;
        
        // Move elements of arr[0..i-1], that are greater than temp, to one position ahead of their current position
        while (j >= 0 && arr[j] > temp) {
            arr[j + 1] = arr[j];
            j--;
        }
        
        // Insert the temp in its correct position
        arr[j + 1] = temp;
    }
}
    
    public void print(int [] arr){
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+"<=>");
        }
        
        
    }
    
    
    
    
    public static void main(String[] args) {
    HelloWorld hh = new HelloWorld();
    int [] arr = {4,2,5,3,6,1,9,0};
    hh.insertion(arr);
       hh.print(arr);
    }
}
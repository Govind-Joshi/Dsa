// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    

  
  
    
 


// resize a array like current length 4  new capcity 8 this method //return 8 length array
public int[] resize(int [] arr, int new_capcity){
    int [] a= new int[new_capcity];
  for(int i =0;i<arr.length;i++){
      a[i] = arr[i];
  }
    arr = a;
    
    return arr;
}




}
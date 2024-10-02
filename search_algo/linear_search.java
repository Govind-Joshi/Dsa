// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public int linearesearch(int[] a,int key){
        for(int i =0;i<a.length;i++){
            if(a[i]==key)return i;
        }
        return -1;
        
        
    }
    
    
    
    public static void main(String[] args) {
        HelloWorld hh = new HelloWorld();
        int [] arr = {4,7,6,9,2,0,1};
        
     int y =    hh.linearesearch(arr,9);
        System.out.println(y+"Try programiz.pro");
    }
}
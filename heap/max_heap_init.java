//top to down rehepify.....


// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Maxheap {
    Integer[] a;
    int n;
    public Maxheap(int size){
        Integer [] a = new Integer[size];
        n = 0;
        
    }
    
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    
    
    
    public static void main(String[] args) {
       Maxheap mm = new Maxheap(4);
       
    }
}
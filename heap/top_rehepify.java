// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Maxheap {
    Integer[] a;
    int n;
    public Maxheap(int size){
          a = new Integer[size+1];
        n = 0;
        
    }
    
    public boolean isEmpty(){
        return n==0;
    }
    public int size(){
        return n;
    }
    
    public void insert_rehipify(int ele){
        if(n==a.length-1){
            resizearray(2*n);
        }
        n++;
        a[n] = ele;
    
        
        swap(n);
        
        
        
    }
    
    public void swap(int k){
       while(k>1 && a[k/2]<a[k]){
           int temp = a[k/2];
           a[k/2] =a[k];
           a[k] = temp;
           
           k = k/2;
           
           
       } 
        
    }
    
    
    public void print(){
        for(int i =1;i<a.length;i++){
            
            System.out.print(a[i]+"<=>");
        }
        
        
    }
    
    public void resizearray(int size){
        Integer [] temp = new Integer[size];
        for(int i =0;i<a.length;i++){
            
            temp[i] = a[i];
        }
        
       a = temp;
        
    }
    
    
    
    public static void main(String[] args) {
       Maxheap mm = new Maxheap(6);
       mm.insert_rehipify(8);
       mm.insert_rehipify(2);
       mm.insert_rehipify(6);
       mm.insert_rehipify(10);
         mm.insert_rehipify(9);
           mm.insert_rehipify(0);
       mm.print();
       
       
    }
}
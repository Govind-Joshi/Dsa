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
        for(int i =1;i<=n;i++){
            
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
    
    
    public int bottem_to_up_rehipefy(){
        int temp = a[1];
        swapp(1,n);
        n--;
       
        
        
        sink(1);
         a[n+1] = null;
    if(n>0 && (n==(a.length-1)/4)){
        resizearray((a.length)/2);
    }     
         
         return temp;
        
    }
    
    public void sink(int k){
        

        while(2*k<=n){
      int j = 2*k;
        if(j<n && a[j]<a[j+1]){
            j++;
        }
        if(a[k]>=a[j]){
            break;
        }
        swapp(j,k);
          k = j;
        
        }
    }
    
    
    public void swapp(int j,int k){
        int temp = a[j];
        a[j]  = a[k];
        a[k] = temp;
        
    }
    
    public static void main(String[] args) {
       Maxheap mm = new Maxheap(6);
       mm.insert_rehipify(8);
       mm.insert_rehipify(2);
       mm.insert_rehipify(6);
       mm.insert_rehipify(10);
         mm.insert_rehipify(9);
           mm.insert_rehipify(0);
          int temp = mm.bottem_to_up_rehipefy();
          System.out.print(temp+"temp....");
       mm.print();
       
       
    }
}
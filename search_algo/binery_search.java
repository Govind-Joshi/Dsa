

class HelloWorld {
    public int binerysearch(int[] a,int key){
      int high = a.length-1;
      int low = 0;
      while(low<=high){
          int mid = low+(high-low)/2;
          if(a[mid]==key){
              return mid;
          }
          else if(a[mid]>key){
              high = mid-1;
          }
          else{
              low = mid+1;
          }
      }
        return -1;
        
    }
    
    
    
    public static void main(String[] args) {
        HelloWorld hh = new HelloWorld();
        int [] arr = {2,4,7,8,11,17};
        
     int y =    hh.binerysearch(arr,11);
        System.out.println(y+"Try programiz.pro");
    }
}
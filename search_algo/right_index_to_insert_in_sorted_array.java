   public int right_index_to_insert_in_sorted_array(int kay,int a){
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
        return low; 
        
     
    }
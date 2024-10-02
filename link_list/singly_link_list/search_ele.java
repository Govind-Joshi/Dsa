    public boolean search_any_ele(int data){
        ListNode curr = head;
      while(curr!=null){
         if(data==curr.data){
             
             return true;
         } 
         curr = curr.next;
          
      }
      return false;
        
        
        
    }
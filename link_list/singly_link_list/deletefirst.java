   public void delete_fist(){
        if(head.next==null){
            head = null;
         
        }
        
        
       ListNode curr = head.next;
       head.next = null;
       head = curr;
        
        
    }
    

    
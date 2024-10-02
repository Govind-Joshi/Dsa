    public ListNode deletelast(){
        if(head==null && head.next ==null){
          return head;
        }
        ListNode curr = head;
        ListNode pri =null;
        while(curr.next!=null){
            pri = curr;
            curr = curr.next;
    
        }
        
        pri.next = null;
        return curr;

    }
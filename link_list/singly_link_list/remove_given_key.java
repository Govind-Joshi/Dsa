    public ListNode remove_given_key(int key){
      ListNode curr = head;
      ListNode temp = null;
      while(curr!=null && curr.data!=key){
          temp = curr;
          curr = curr.next;
          
      }
        if(curr==null)return curr;
        temp.next = curr.next;
        return curr;
    }
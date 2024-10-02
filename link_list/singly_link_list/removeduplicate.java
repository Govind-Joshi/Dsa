  public void removeduplicate(){
      ListNode start = head;
    //   ListNode s2 = head;
      while(start!=null && start.next !=null ){
     if(start.data=start.next.data)     
         start.next = start.next.next; 
      }else{
         start = start.next; 
      }
  }
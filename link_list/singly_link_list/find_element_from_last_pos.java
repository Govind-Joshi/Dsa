  
  public int find_from_last(int n){
      ListNode curr = head;
      ListNode main = head;
    int count = 0;  
      while(count<n){
          curr = curr.next;
          count++;
      }
      while(curr!=null){
          curr = curr.next;
          main = main.next;
      }
      
      return main.data;
      
  }
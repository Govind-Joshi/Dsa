public void removeloop(ListNode slow){
   ListNode curr = head;
   while(curr.next.data!=slow.next.data){
       curr = curr.next;
       slow = slow.next;
   }
  slow.next = null;
    
}
public int middle_node(){
  ListNode  fastele = head;
  ListNode slowele = head;
  while(fastele!=null && fastele.next!=null){
      slowele = slowele.next;
      fastele = fastele.next.next;
  }
    
    
    
    return slowele.data;
}
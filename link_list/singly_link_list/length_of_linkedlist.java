// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Init_singly_link_list {
  
  private ListNode head;  
private  static class ListNode{
  private int data;
  private ListNode next;
  
  
  
  public ListNode(int data){
      this.data = data;
      this.next = null;
      
  }
     
    
    
}


  
    
    


   public int length_of_link_list(){
       ListNode curr  = head;
       int count =0;
       while(curr!=null){
           count++;
           curr = curr.next;
           
           
           
       }
       return count;
       
       
   }
    
    
    
    
    public static void main(String[] args) {
     Init_singly_link_list  ii = new Init_singly_link_list();
     ii.head = new ListNode(10);
     ListNode second = new ListNode(1);
     ListNode third = new ListNode(2);
     ListNode forth = new ListNode(3);
     ii.head.next = second;
     second.next = third;
     third.next = forth;  // 10-->>1-->>2-->3-->>null
 System.out.println(ii.length_of_link_list());
    }
}
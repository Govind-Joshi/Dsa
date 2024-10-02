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


  
    
    






    
    public void printarray(){
      ListNode curr = head;
      while(curr!=null){
          System.out.print(curr.data+"==>>");
          curr = curr.next;
      }
      
       System.out.print("null");
    }
//   public int length_of_link_list(){
//       ListNode curr  = head;
//       int count =0;
//       while(curr!=null){
//           count++;
//           curr = curr.next;
           
           
           
//       }
//       return count;
       
       
//   }
    
    // insert in strting of linked list 
    public void insert_instart(int data){
        ListNode ll = new ListNode(data); // ll = data==>>null
        ll.next = head;
        head = ll;
        
    }
    
    
    // insert in ending of linked list..
    public void insert_at_last(int data){
        ListNode ll = new ListNode(data);
      if(head==null){
          ll.next = head;
          head = ll;
          return;
      }  
      
      ListNode curr = head;
      while(curr.next!=null){
          curr = curr.next;
      }
      curr.next = ll;
     
        
        
    }
    
    
    
    public static void main(String[] args) {
     Init_singly_link_list  ii = new Init_singly_link_list();
    //  ii.head = new ListNode(10);
    //  ListNode second = new ListNode(1);
    //  ListNode third = new ListNode(2);
    //  ListNode forth = new ListNode(3);
    //  ii.head.next = second;
    //  second.next = third;
    //  third.next = forth;  // 10-->>1-->>2-->3-->>null
    // ii.insert_at_last(10);
    //  ii.insert_at_last(6);
    //     ii.insert_at_last(9);
            ii.insert_instart(10);
     ii.insert_instart(6);
        ii.insert_instart(9);
    
 ii.printarray();
//  System.out.println(ii.length_of_link_list());
    }
}
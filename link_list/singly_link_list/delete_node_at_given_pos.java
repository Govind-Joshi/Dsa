
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

    
    public void deletenode_at_given_position(int pos){
        if(pos==1){
            head = head.next;
        }else
        {
            ListNode curr = head;
            ListNode pri = null;
            int count = 1;
            while(count<=pos-1){
                pri = curr;
                curr = curr.next;
                count++;
            }
            
            pri.next = curr.next;
            
            
            
        }
        
        
        
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
    // ii.delete_fist();
    // ii.deletelast();
    //  ii.deletelast();
    //   ii.deletelast();
    ii.deletenode_at_given_position(2);
        // ii.deletenode_at_given_position(2);
 ii.printarray();
//  System.out.println(ii.length_of_link_list());
    }
}
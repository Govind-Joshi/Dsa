// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class init_singly_link_list {
  
  private ListNode head;  
private  static class ListNode(){
  private int data;  // here we can keep data type any generic type 
  private ListNode next;
  
  
  
  public ListNode(int data){
      this.data = data;
      this.next = null;
      
  }
   
    
}

    
    public static void main(String[] args) {
     Init_singly_link_list  ii = new Init_singly_link_list();
     ii.head = new ListNode(10);
     ListNode second = new ListNode(1);
     ListNode third = new ListNode(2);
     ListNode forth = new ListNode(3);
     ii.head.next = second;
     second.next = third;
     thrid.next = fourth;  // 10-->>1-->>2-->3-->>null
  
    }

}








// proper print method ...
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
    
    
    public static void main(String[] args) {
     Init_singly_link_list  ii = new Init_singly_link_list();
     ii.head = new ListNode(10);
     ListNode second = new ListNode(1);
     ListNode third = new ListNode(2);
     ListNode forth = new ListNode(3);
     ii.head.next = second;
     second.next = third;
     third.next = forth;  // 10-->>1-->>2-->3-->>null
 ii.printarray();
    }
}




















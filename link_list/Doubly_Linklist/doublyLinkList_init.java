// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Doubly_LInked_List {
  
  private ListNode head; 
  private ListNode tail;
  private int length; 
private  static class ListNode{
  private int data;
  private ListNode next;
  private ListNode pri;
  
  
  
  public ListNode(int data){
      this.data = data;
      this.next = null;
      this.pri = null;
      
  }
  
    
}

public Doubly_LInked_List(){
    this.head = null;
    this.length = 0;
    this.tail = null;
    
    
}

public boolean isEmpty(){
    
    return length==0;
    
}
public int length_of_list(){
    return length;
}
  
    
    






    
    public void printarray(){
        if(head==null)return;
      ListNode curr = head;
      while(curr!=null){
          System.out.print(curr.data+"==>>");
          curr = curr.next;
      }
      
       System.out.print("null");
    }
    
    public void printarray_backword(){
        if(tail==null)return;
      ListNode curr = tail;
      while(curr!=null){
          System.out.print(curr.data+"==>>");
          curr = curr.pri;
      }
      
       System.out.print("null");
    }


    public void insert_bgn(int a){
      ListNode temp = new ListNode(a);
      if(isEmpty()){
          tail = temp;
      }
      else{
       
       head.pri = temp;   
          
          
      }
        temp.next = head;
        head = temp;
        length++;
        
    }

    public void insert_last(int a){
      ListNode temp = new ListNode(a);
      if(isEmpty()){
          head = temp;
      }
      else{
       
       tail.next = temp;
       temp.pri = tail; 
          
          
      }
      tail = temp;
        length++;
        
    }
    
        
public ListNode deletefirst(){
   if(isEmpty()){
   //    throw new ExceptionNoSuchValue();
   }
   ListNode ll = head;
   if(head==tail){
    tail = null;   
   }
   else{
       
     head.next.pri = null;  
       
   }
 head = head.next;
   ll.next = null;
  length++;
  return ll;
  
}



public ListNode deletelast(){
   if(isEmpty()){
   //    throw new ExceptionNoSuchValue();
   
   }
   ListNode ll = tail;
   if(head==tail){
    head = null;   
   }
   else{
       
     tail.pri.next = null; 
     tail   = tail.pri;
       
   }

   ll.pri = null;
  length++;
  return ll;
  
}



    



      
  
  

    
    
    
    
    
    public static void main(String[] args) {
     Doubly_LInked_List  ii = new Doubly_LInked_List();
    //  ii.head = new ListNode(10);
    //  ListNode second = new ListNode(1);
    //  ListNode third = new ListNode(2);
    //  ListNode forth = new ListNode(4);
     
    //  ii.head.next = second;
    //  second.next = third;
    //  third.next = forth;  // 10-->>1-->>2-->3-->>null
     
    //       Init_singly_link_list secondList = new Init_singly_link_list();
    //     secondList.head = new ListNode(3);
    //     ListNode secondNode = new ListNode(5);
    //     ListNode thirdNode = new ListNode(8);
    //     secondList.head.next = secondNode;
    //     secondNode.next = thirdNode;

     
     
     
    // forth.next =  second;
    // ii.insert_at_last(10);
    //  ii.insert_at_last(6);
    //     ii.insert_at_last(9);
    //         ii.insert_instart(10);
    //  ii.insert_instart(9);
    //     ii.insert_instart(6);
    // ii.delete_fist();
    // ii.deletelast();
    //  ii.deletelast();
    //   ii.deletelast();
    // ii.deletenode_at_given_position(2);
        // ii.deletenode_at_given_position(2);
//     ii.insert_instart(7);
//   ListNode g =  ii.remove_given_key(6);
ii.insert_bgn(6);
ii.insert_bgn(8);
ii.insert_bgn(9);
// ii.deletelast();
ii.deletefirst();
ii.printarray();
// ii.printarray_backword();
//  System.out.println(ii.dectectLoopinlinkedlist().data+"=>tt");
    }
}
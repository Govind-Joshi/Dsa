// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Queue {
  
  private ListNode frnt; 
    private ListNode rear; 

  private int length; 
private  static class ListNode{
  private int data;
  private ListNode next;

  
  
  
  public ListNode(int data){
      this.data = data;
      this.next = null;
  
      
  }
  
    
}

public Queue(){
    this.frnt = null;
    this.rear = null;
    this.length = 0;
 
    
    
}

public boolean isEmpty(){
    
    return length==0;
    
}
public int length_of_list(){
    return length;
}
  public void enque(int a){
      ListNode temp = new ListNode(a);
      if(frnt==null){
          frnt = temp;
      }
      else{
      rear.next = temp;
;
      }
            rear = temp;
      length++;
      
      
  }
    
    
public int peek(){
    return frnt.data;
}
public int dqueue(){
    if(isEmpty()){
    // throw new Exception();
    }
ListNode temp = frnt;
frnt = frnt.next;
temp.next = null;
return temp.data;
    
}





    
    public void printarray(){
        if(frnt==null)return;
// ;ListNode st = top.next;

      while(frnt!=null){
          System.out.print(frnt.data+"==>>");
          frnt = frnt.next;
      }
      
    //   System.out.print(top.data);
    }
    
    
    public static void main(String[] args) {
     Queue  ii = new Queue();
    ii.enque(3);
    ii.enque(4);
    ii.enque(0);
    ii.enque(9);
   //  System.out.print(ii.peek()+" rrr");
    ii.dqueue();
    
   
    
//     ii.insertfirst(7);
   //  ii.insertlast(4);
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
// ii.insert_bgn(6);
// ii.insert_bgn(8);
// ii.insert_bgn(9);
// ii.deletelast();
// ii.deletefirst();
//ii.deletefirst();

// System.out.println("=>tt");
ii.printarray();
// ii.printarray_backword();
//  System.out.println(ii.dectectLoopinlinkedlist().data+"=>tt");
    }
}
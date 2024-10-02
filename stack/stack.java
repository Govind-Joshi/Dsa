// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Stack {
  
  private ListNode top; 

  private int length; 
private  static class ListNode{
  private int data;
  private ListNode next;

  
  
  
  public ListNode(int data){
      this.data = data;
      this.next = null;
  
      
  }
  
    
}

public Stack(){
    this.top = null;
    this.length = 0;
 
    
    
}

public boolean isEmpty(){
    
    return length==0;
    
}
public int length_of_list(){
    return length;
}
  public void push(int a){
      ListNode temp = new ListNode(a);
      if(top==null){
          top = temp;
      }
      else{
          temp.next = top;
          top = temp;
          
          
      }
      
      length++;
      
      
  }
    
    
public int peek(){
    return top.data;
}
public int pop(){
    if(isEmpty()){
    // throw new Exception();
    }
ListNode temp = top;
top = top.next;
temp.next = null;
return temp.data;
    
}





    
    public void printarray(){
        if(top==null)return;
// ;ListNode st = top.next;

      while(top!=null){
          System.out.print(top.data+"==>>");
          top = top.next;
      }
      
    //   System.out.print(top.data);
    }
    



    
        













    
    
    public static void main(String[] args) {
     Stack  ii = new Stack();
    ii.push(3);
    ii.push(4);
    ii.push(0);
    ii.push(9);
   //  System.out.print(ii.peek()+" rrr");
    ii.pop();
    
   
    
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
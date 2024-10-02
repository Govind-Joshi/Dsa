// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class circular_Linked_List {
  
  private ListNode last; 

  private int length; 
private  static class ListNode{
  private int data;
  private ListNode next;

  
  
  
  public ListNode(int data){
      this.data = data;
      this.next = null;
  
      
  }
  
    
}

public circular_Linked_List(){
    this.last = null;
    this.length = 0;
 
    
    
}

public boolean isEmpty(){
    
    return length==0;
    
}
public int length_of_list(){
    return length;
}
  
    
    






    
    public void printarray(){
        if(last==null)return;
;ListNode st = last.next;

      while(st!=last){
          System.out.print(st.data+"==>>");
          st = st.next;
      }
      
       System.out.print(st.data);
    }
    



    
        






public void createLinkedList(){
    ListNode first = new ListNode(10);
    ListNode secod = new ListNode(2);
     ListNode third = new ListNode(5);
      ListNode fourth = new ListNode(9);
       ListNode fifth = new ListNode(1);
       
       first.next = secod;
       secod.next = third;
       third.next = fourth;
       fourth.next = fifth;
       fifth.next = first;
       last = fifth;
       
}



public void insertfirst(int a){
    ListNode temp = new ListNode(a);
    if(last==null){
        last = temp;
    }
    else{
        temp.next = last.next;
        
        
    }
    last.next = temp;
   length++; 

    
}


public void insertlast(int n){
    ListNode temp = new ListNode(n);
    if(last==null){
        last = temp;
        last.next = last;
    }
    else{
        temp.next = last.next;
        last.next = temp;
         last = temp;
    }
    length++;
    
}


public ListNode deletefirst(){
    if(isEmpty()){
        
        
        return null ;
    }
    ListNode temp = last.next;
    
    if(last==last.next){
        last = null;
    }
    else{
      last.next = temp.next;
    }
    temp.next = null;
    length--;
    return temp;
    
    
}

public ListNode deleteLast(){
    // if(isEmpty()){
    //     return null;
    // }
    ListNode temp = last.next;
    while(temp.next!=last){
        temp = temp.next;
    }
    ListNode tt = last;
    temp.next = last.next;
    // last.next = null;
    // last = temp;
    tt.next = null;
    return tt;
}

    



      
  
  

    
    
    
    
    
    public static void main(String[] args) {
     circular_Linked_List  ii = new circular_Linked_List();
     ii.createLinkedList();
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

 System.out.println(ii.deleteLast().data+"=>tt");
ii.printarray();
// ii.printarray_backword();
//  System.out.println(ii.dectectLoopinlinkedlist().data+"=>tt");
    }
}
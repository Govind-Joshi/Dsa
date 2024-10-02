
public ListNode mergeTwosorted(ListNode a,ListNode b){
    int t = new ListNode(0);
    
    ListNode dum = t;
    while(a!=null && b!=null){
        if(a<.data<=b.data){
            dum.next = a;
            a = a.next;
            
            
        }
        else{
            dum.next = b;
            b = b.next;
            
        }
        dum = dum.next;
         
        
    }
    if(a!=null){
        dum.next = a;
        
    }
    else{
        dum.next = b;
    }
    return dum.next;
    
}
    













    //****************************************************************** */
//     // Online Java Compiler  remaing merge...apply
// // Use this editor to write, compile and run your Java code online

// class Init_singly_link_list {
  
//   private ListNode head;  
// private  static class ListNode{
//   private int data;
//   private ListNode next;
  
  
  
//   public ListNode(int data){
//       this.data = data;
//       this.next = null;
      
//   }
  
  
    
    
    
// }


  
    
    






    
//     public void printarray(){
//       ListNode curr = head;
//       while(curr!=null){
//           System.out.print(curr.data+"==>>");
//           curr = curr.next;
//       }
      
//        System.out.print("null");
//     }
// //   public int length_of_link_list(){
// //       ListNode curr  = head;
// //       int count =0;
// //       while(curr!=null){
// //           count++;
// //           curr = curr.next;
           
           
           
// //       }
// //       return count;
       
       
// //   }
    
//     // insert in strting of linked list 
//     public void insert_instart(int data){
//         ListNode ll = new ListNode(data); // ll = data==>>null
//         ll.next = head;
//         head = ll;
        
//     }
    
        
// public ListNode dectectLoopinlinkedlist(){
//     ListNode fastcurr = head;
//     ListNode slowcurr = head;
//     while(fastcurr!=null && fastcurr.next!=null){
        
     
//         slowcurr = slowcurr.next;
//            fastcurr = fastcurr.next.next;
//         if(slowcurr==fastcurr)return startingpoint(slowcurr);
//     }
//     return null;
    
    
// }


// public ListNode mergeTwosorted(ListNode a,ListNode b){
//     int t = new ListNode(0);
    
//     ListNode dum = t;
//     while(a!=null && b!=null){
//         if(a<.data<=b.data){
//             dum.next = a;
//             a = a.next;
            
            
//         }
//         else{
//             dum.next = b;
//             b = b.next;
            
//         }
//         dum = dum.next;
         
        
//     }
//     if(a!=null){
//         dum.next = a;
        
//     }
//     else{
//         dum.next = b;
//     }
//     return dum.next;
    
// }
    



      
  
  

    
    
    
    
    
//     public static void main(String[] args) {
//      Init_singly_link_list  ii = new Init_singly_link_list();
//      ii.head = new ListNode(10);
//      ListNode second = new ListNode(1);
//      ListNode third = new ListNode(2);
//      ListNode forth = new ListNode(4);
     
//      ii.head.next = second;
//      second.next = third;
//      third.next = forth;  // 10-->>1-->>2-->3-->>null
     
//            Init_singly_link_list secondList = new Init_singly_link_list();
//         secondList.head = new ListNode(3);
//         ListNode secondNode = new ListNode(5);
//         ListNode thirdNode = new ListNode(8);
//         secondList.head.next = secondNode;
//         secondNode.next = thirdNode;

     
     
     
//     // forth.next =  second;
//     // ii.insert_at_last(10);
//     //  ii.insert_at_last(6);
//     //     ii.insert_at_last(9);
//     //         ii.insert_instart(10);
//     //  ii.insert_instart(9);
//     //     ii.insert_instart(6);
//     // ii.delete_fist();
//     // ii.deletelast();
//     //  ii.deletelast();
//     //   ii.deletelast();
//     // ii.deletenode_at_given_position(2);
//         // ii.deletenode_at_given_position(2);
// //     ii.insert_instart(7);
// //   ListNode g =  ii.remove_given_key(6);
// //ii.printarray();
//  System.out.println(ii.dectectLoopinlinkedlist().data+"=>tt");
//     }
// }
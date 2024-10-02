// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    ListNode head;
  private static class ListNode(){
       ListNode next;
       int data;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
        
  }    
  
  
  public void insertatposition(int data,int position){
      if(position==1){
          ListNode newnode = new ListNode(data);
          node.next = head;
          head = node;
          
          
          
      }
      else{
         ListNode pri = head;
         int count = 1;
         while(count<position-1){
            pri =  pri.next; 
             count++
         }
         ListNode newnode = new ListNode(data);
         ListNode curr = privious.next;
         newnode.next = curr;
         privious.next = newnode;
          
      }
      
      
      
  }
        
    
    
    
    
    
    
    public static void main(String[] args) {
       
    }
}
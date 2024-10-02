    
public boolean dectectLoopinlinkedlist(){
    ListNode fastcurr = head;
    ListNode slowcurr = head;
    while(fastcurr!=null && fastcurr.next!=null){
        
     
        slowcurr = slowcurr.next;
           fastcurr = fastcurr.next.next;
        if(slowcurr==fastcurr)return true;
    }
    return false;
    
    
}
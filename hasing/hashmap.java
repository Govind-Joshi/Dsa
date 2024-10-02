// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HashMap {
    
    private ListNode[] arr;
    int size;
    int cap;
    public HashMap(){
        
        this(10);
        
    }
    public HashMap(int cap){
      this.arr = new ListNode[cap];
      this.size = 0;
      this.cap = cap;
    }
    
    class ListNode{
        Integer key;
        String value;
        ListNode next;
        public ListNode(Integer key,String value){
            this.key = key;
            this.value = value;
            this.next = null;
        }
        
        
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public int index_fix(Integer key){
        return key%cap;
    }
    public void put(Integer key,String value){
        int index = index_fix(key);
        ListNode head = arr[index];
        while(head!=null){
            if(head.key.equals(key)){
                head.value = value;
            }
            head = head.next;
        }
        size++;
        head = arr[index];
        ListNode nenode = new ListNode(key,value);
        head = nenode.next;
        arr[index] = nenode;
        
    }
    public String get(Integer  key){
        if(key==null)return "Not fount";
        int index =  index_fix(key);
        ListNode head =  arr[index];
        ListNode pri = null;
        while(head!=null){
            if(head.key.equals(key)){
             return head.value;    
            }
            
        // pri = head;
        head = head.next;
        }
        // size--;
        return null;
        
    }
    public void remove(Integer key){
            int index =  index_fix(key);
        ListNode head =  arr[index];
        ListNode pri = null;
        while(head!=null){
           if(head.key.equals(key)){
               break;
           }
           pri = head;
           head = head.next;
        }
        size--;
        if(pri==null){
             arr[index] = head.next;
        }
        else{
            pri.next = head.next; 
        }
    }
    
    
    public static void main(String[] args) {
    HashMap hh = new HashMap();
    hh.put(10,"gj");
        hh.put(1,"ej");
           hh.put(4,"yj");
            hh.put(2,"aj");
                   hh.put(2,"vbj");
    System.out.print(hh.get(4)+" ");
        System.out.print(hh.size());
         hh.remove(4);
          System.out.print(hh.get(4) +" ");
              System.out.print(hh.size()+" ");
    }
}
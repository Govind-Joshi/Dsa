// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Trie{
    TrieNode root;
    
    
    public  Trie(){
        this.root = new TrieNode(); 
    }
    
    class TrieNode{
        boolean istrue;
        TrieNode []arr;
        
        public TrieNode(){
            this.istrue = false;
            this.arr = new TrieNode[26];
        }
    }
        
        
        public void insert(String s){
            if(s==null){
            //throw new inlegalException();     
            }
            
            s = s.toLowerCase();   
            TrieNode curr = root;
            for(int i =0;i<s.length();i++){
                   char c = s.charAt(i);
                int index = c-'a';
                    
                if(curr.arr[index]==null){
                      TrieNode dumy = new TrieNode();
                      curr.arr[index]  = dumy;
                      curr = dumy;
                }
                else{
                      curr = curr.arr[index];
                }
                
            }
         
            
            
        }
        
        
    
    
    
    
    public static void main(String[] args) {
 Trie hh = new Trie();
 hh.insert("gj");
    }
}
class ListNode{
         
    constructor( data){
        this.data = data;
        this.left = null;
        this.right = null;
        
        
        
    }
    
    
}




class Binarytree{
constructor(){
    this.length = 0;
    this.root = null;
    
    
}



init(){
  let first = new ListNode(4);
  let second = new ListNode(5);
  let third = new ListNode(1);
  let forth = new ListNode(9);
  let five = new ListNode(7);
  first.left = second;
  first.right = third;
  second.left = forth;
  second.right = five;
  this.root =first; 
}  





   inorder(node) {
// Default to root if no node is passed
if (node === undefined) {
 node = this.root;
}

// Base case for recursion
if (node == null) {
 return;
}

// Traverse the left subtree
this.inorder(node.left);
// Print the current node's data
console.log(node.data);
// Traverse the right subtree
this.inorder(node.right);
}
}






let  b = new Binarytree();
b.init();
// b.preorder();
//b.inorder();
b.postorder();
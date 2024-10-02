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

preorder(node){
      if (node === undefined) {
 node = this.root;
}
    if(node==null){
        return ;
    }
    console.log(node.data);
    this.preorder(node.left);
     this.preorder(node.right);
   
}




}






let  b = new Binarytree();
b.init();
// b.preorder();
//b.inorder();
b.postorder();
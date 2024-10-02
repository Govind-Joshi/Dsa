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

     postorder( node = this.root){

    if(node==null){
        return ;
    }

    this.postorder(node.left);
     this.postorder(node.right);
         console.log(node.data);
   
}



}






let  b = new Binarytree();
b.init();
// b.preorder();
//b.inorder();
b.postorder();
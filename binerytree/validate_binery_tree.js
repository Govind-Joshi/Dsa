class Levalordertriversal {

    constructor() {
        this.root = null;
    }

    // Moved the init method to Levalordertriversal class
    init() {
        let first = new TreeNode(2);
        let scd = new TreeNode(3);
        let thrd = new TreeNode(6);
        let frth = new TreeNode(8);
        let five = new TreeNode(1);
        
        first.left = scd;
        first.right = thrd;
        scd.left = frth;
        scd.right = five;
        
        this.root = first; // Correctly assigning the root
    }





valid1(){
let node =  this.root;
let result = [];

return this.validatetree(node,-1000,1000);

}
// here we apply inorder triversal for validate it in inorder triversal a bineay search trre always give result in accending order..
validatetree(node,min,max)
{
if(node==null)return true;
if(node.data<=min || node.data>=max)return false;

let left = this.validatetree(node.left,min,node.data);
//console.log(temp,"<=>",node.data)
if(left){
left = this.validatetree(node.right,node.data,max);
return left;
}

return false;

}











}

// TreeNode class should not contain the init method or root assignment
class TreeNode {

    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Now we can create the tree and run the preorder traversal
let lvl = new Levalordertriversal();

let result = lvl.valid1();














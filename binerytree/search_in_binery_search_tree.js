class Levalordertriversal {

    constructor() {
        this.root = null;
    }

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




search_in_bineary_tree(node){
let rotnode =  this.root;

let result = this._search_in_bineary_tree(node,rotnode);

  return result;
}

_search_in_bineary_tree(serchvalue,rotnode){
if(rotnode==null)return false;
if(rotnode.data==serchvalue)return true;
if(rotnode.data<serchvalue)return this._search_in_bineary_tree(serchvalue,rotnode.right);
if(rotnode.data>serchvalue)return this._search_in_bineary_tree(serchvalue,rotnode.left);
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

lvl.search_in_bineary_tree(9);









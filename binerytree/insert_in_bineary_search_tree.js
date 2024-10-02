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

    // Pre-order traversal
    preorder(node = this.root) {
        if (node == null) {
            return;
        }
        console.log(node.data);
        this.preorder(node.left);
        this.preorder(node.right);
    }



inser_in_bineary_search_tree(n){
    this.root = this._inser_in_bineary_search_tree(this.root,n);
}
_inser_in_bineary_search_tree(node, n) {
    if (node == null) {
        return new TreeNode(n); // Creating a new TreeNode
    }

    if (n < node.data) {
        node.left = this._inser_in_bineary_search_tree(node.left, n); // Recursion on left child
    } else {
        node.right = this._inser_in_bineary_search_tree(node.right, n); // Recursion on right child
    }

    return node; // Returning the unchanged node pointer
}

}


class TreeNode {

    constructor(data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}


let lvl = new Levalordertriversal();

lvl.inser_in_bineary_search_tree(6);
lvl.inser_in_bineary_search_tree(9);
lvl.inser_in_bineary_search_tree(1);
lvl.inser_in_bineary_search_tree(8);
lvl.inser_in_bineary_search_tree(3);
lvl.preorder();












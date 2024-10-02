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
    lvl_order(){
        let node = this.root;
        this._lvl_order(node);  
    }

    // Pre-order traversal
    _lvl_order(node) {
let arr = [];
arr.push(node);

while(arr.length!=0){
let d = arr.shift();
console.log(d.data);
if(d.left!=null){
arr.push(d.left);
}
if(d.right!=null){
arr.push(d.right);
}
}




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

lvl.init();
lvl.lvl_order();












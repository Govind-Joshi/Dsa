function itrativeaproch_preorder(){
    let arr = [];
    arr.push(this.root);
    while(arr.length!=0){
        let a = arr.pop()
        console.log(a.data,"ttt");
             if(a.right!=null){
        arr.push(a.right);
            }
        if(a.left!=null){
        arr.push(a.left);
        }
       
    }
    
   
    
}
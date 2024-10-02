class Leval_Order{
levalorder(node=this.root,leval,result){
    if(node==null)return;
  if(!result[leval]){  
  result[leval] = [];
  }
  
  result[leval].push(node.data); 
  this.levalorder(node.left,leval+1,result);
  
  this.levalorder(node.right,leval+1,result);
  
      }
    }
public String binearynum_genrator(int n){
    String[] arr = new String[n];
     Queue<String> q = new LinkedList<>();
  q.offer("1");
  for(int i =0;i<n;i++){
    arr[i] = q.poll();
    String s1 = arr[i]+"0";
    String s2 = arr[i]+"1";
    q.offer(s1);
    q.offer(s2);
      
    
  }
  return arr[n-1];
}
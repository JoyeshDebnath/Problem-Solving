class Solution {
    public int minimumOperations(int[] nums) {
        int counter=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:nums){
            if(n!=0) 
                 pq.add(n);
        }
       
        if(pq.size()==0)
            return 0;
        
        while(!pq.isEmpty()){
            counter++;
            int smallest=pq.poll();
            int sz=pq.size();
             System.out.println(pq.size());
            PriorityQueue<Integer> temp=new PriorityQueue<>();
            
            while(sz-->0)
            {
            
                int b=pq.poll();
                System.out.println("Inner Loop"+b);
                b-=smallest;
                if(b>0)
                      temp.add(b);
            }
            pq=temp;
        }//outer 
        
        return counter;
    }
}
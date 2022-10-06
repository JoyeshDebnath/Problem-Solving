class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int a:amount){
         if(a!=0)
               pq.add(a);
        }
        int counter=0;
        
        while(pq.isEmpty()==false){
            counter++;
            int sz=pq.size();
            if(sz>=2){
                int a=0;
                int b=0;
                a=pq.poll();
                b=pq.poll();
                --a;
                --b;
                if(a!=0)
                     pq.add(a);
                if(b!=0)
                    pq.add(b);
            }
            else if(sz<2){
                int a=pq.poll();
                --a;
                
                if(a!=0)
                     pq.add(a); 
            }
        }//
        
        return counter;
    }
}
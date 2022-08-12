class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            return b[1]-a[1];
        });//sort in descending order on basis of Position 
        
        int counter=0;
        double Time=0.0;
        
        for(int i=0;i<position.length;i++)
        {
            pq.add(new int[]{i,position[i]});
        }
        while(!pq.isEmpty()){
            
            int rem[]=pq.poll();
            int index=rem[0];
            int pos=rem[1];
            int spd=speed[index];
            double TimeReq=(double)(target-pos)/spd;
            if(TimeReq>Time)
            {
                //if the tinme req by the caar is more then the previous then new fleet will be required ...
                Time=TimeReq;
                counter++;
            }
            
        }
        
        return counter;
    }
}
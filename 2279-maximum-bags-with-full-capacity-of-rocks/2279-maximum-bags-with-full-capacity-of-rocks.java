class Solution {

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        
        int Vacancy[]=new int [capacity.length];
        int BagsFull=0;
        for(int i=0;i<capacity.length;i++){
            Vacancy[i]=capacity[i]-rocks[i];
            if(Vacancy[i]==0){
                BagsFull++;
            }
        }//
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int v:Vacancy){
            if(v==0){
                continue;
            }
            pq.add(v);
        }
        
        while(!pq.isEmpty() && additionalRocks!=0){
            int spaceLeft=pq.poll();
            if(spaceLeft<=additionalRocks){
                additionalRocks-=spaceLeft;
                BagsFull++;
            }
        }
        
        return BagsFull;
        
        
        
        
        
    }
}

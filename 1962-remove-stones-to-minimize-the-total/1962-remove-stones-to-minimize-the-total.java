class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int pile:piles)
                   pq.add(pile);
        
        while(k-->0){
            int rem=pq.poll();
            // System.out.println(rem);
            rem=rem-(int)Math.round(rem/2);
            // System.out.println("M: "+rem);
            pq.add(rem);
            
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
    return sum;
    }
}
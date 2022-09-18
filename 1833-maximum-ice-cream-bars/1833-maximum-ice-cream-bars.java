class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int totalIceCreams=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int cost:costs)
                  pq.add(cost);
        
        while(!pq.isEmpty() && coins>=0){
            int diff=coins-pq.poll();
            if(diff<0)
                   break;
            else {
                coins=diff;
                totalIceCreams++;
                
            }
        }
        
        return totalIceCreams;
            
    }
}
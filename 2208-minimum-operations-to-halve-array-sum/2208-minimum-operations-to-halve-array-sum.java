class Solution {
    public int halveArray(int[] nums) {
     PriorityQueue<Double> pq=new PriorityQueue<>(Collections.reverseOrder()); 
    double sum=0.0;
        for(int num:nums){
           pq.add((double)num);
           sum+=num;
        }
        double half=sum/2.0;
        int steps=0;
        while(sum>half){
            steps++;
            double rem=pq.poll();
            rem=rem/2.0;
            sum-=rem;
            pq.add(rem);
        }
        return steps;
    }
}
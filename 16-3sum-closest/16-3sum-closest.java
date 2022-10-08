class Solution {
    public int threeSumClosest(int[] A, int target) {
        int closest=Integer.MAX_VALUE;
         int diff=Integer.MAX_VALUE;
        Arrays.sort(A);
        for(int i=0;i<A.length-2;i++){
            System.out.println("I="+A[i]);
            
            int j=i+1;
            int k=A.length-1;
            // int sum=0;
            while(j<k){
                int sum=A[i]+A[j]+A[k];
                // System.out.println("SUM="+sum);
                if(sum==target)
                        return sum;
                
                if(Math.abs(sum-target)<Math.abs(closest-target)){
                    // diff=Math.abs(sum-target);  
                    closest=sum;
                }
                // System.out.println("Difference ="+Math.abs(target-sum));
                
              
                
                if(sum>target)
                     k--;
                
                else if(sum<target)
                       j++;
            }
            
        }//outer
        
        return closest;
    }
}
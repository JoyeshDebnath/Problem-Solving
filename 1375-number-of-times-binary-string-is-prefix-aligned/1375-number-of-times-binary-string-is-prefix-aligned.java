class Solution {
    public int numTimesAllBlue(int[] flips) {
        
        int allBulbsLit=0;
        int maxIndex=0;
        int n=flips.length;
        for(int i=0;i<n;i++)
        {
             maxIndex=Math.max(maxIndex,flips[i]);
            if(i+1==maxIndex)
                  allBulbsLit++;
            
        }
        
        return allBulbsLit;
    }
    
}
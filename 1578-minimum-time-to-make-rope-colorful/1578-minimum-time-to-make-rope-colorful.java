class Solution {
    public int minCost(String colors, int[] neededTime) {
        int i=0;
        int j=0;
        int Ans=0;
        int n=colors.length();
        int currGrpSum;
        int currGrpMaxm;
        while(j<n){
            currGrpSum=0;
            currGrpMaxm=0;
            while(j<n && colors.charAt(i)==colors.charAt(j)){
               currGrpSum+=neededTime[j];
               currGrpMaxm=Math.max(currGrpMaxm,neededTime[j]);
               j++;
            }
            Ans+=(currGrpSum-currGrpMaxm);
            i=j;
        }
        
        return Ans;
    }
}
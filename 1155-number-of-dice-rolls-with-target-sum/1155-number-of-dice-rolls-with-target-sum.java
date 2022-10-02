class Solution {
    Integer memo[][];
    public int numRollsToTarget(int n, int k, int target) {
        memo=new Integer[target+1][n+1];
        
        // return numRollsToTargetRec(target,n,k);
        return numRollsToTargetTab(n,k,target);
    }
    
    public int numRollsToTargetTab(int n,int k,int target){
        
        int dp[][]=new int[target+1][n+1];
        for(int i=0;i<=target;i++){
            for(int j=0;j<=n;j++){
                if(i==0 && j==0)
                {
                    dp[i][j]=1;
                    continue;
                }
                if(i==0){
                    dp[i][j]=0;
                    continue;
                }
                if(j==0){
                    dp[i][j]=0;
                    continue;
                }
                int ways=0;
              for(int m=1;m<=k;m++){
                  if((i-m)>=0 && (j-1)>=0){
                              ways+=dp[i-m][j-1];
              
                               ways%=1000000007;
                  }
              }
                dp[i][j]=ways;
            }
        }
        return dp[target][n];
    }//tabulation 
    
    public int numRollsToTargetRec(int target,int n,int k){
        //if used up all dice and reached the target
        if(n==0 && target==0)
                return 1;
        //if dice left but target reached zero 
        if(n!=0 && target==0)
                 return 0;
        //if dice reached zero but target left 
        if(n==0 && target!=0)
                    return 0;
        
        if(n<=0 || target<=0)
            return 0;
        
        if(memo[target][n]!=null)
              return memo[target][n];
        
        int ways=0;
        
        //we have k faces to try SO we need to consider a range bw 1 to K
        for(int i=1;i<=k;i++){
            ways+=numRollsToTargetRec(target-i,n-1,k);
            ways%=1000000007;
        }
       return memo[target][n]=ways; 
    }//rec / memo
}
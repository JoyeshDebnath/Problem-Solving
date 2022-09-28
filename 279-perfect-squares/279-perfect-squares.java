class Solution {
    int ans =Integer.MAX_VALUE;
    Integer memo[]=new Integer[10000];
    public int numSquares(int n) {
        return perfectSquares(n);
    }
    
    public int perfectSquares(int n){
        if(n<=3)
               return n;
        
        if(memo[n]!=null)
              return memo[n];
        
        for(int i=1;i*i<=n;i++){
            ans=Math.min(ans,1+perfectSquares(n-(i*i)));
        }
        return memo[n]=ans;
    }
}
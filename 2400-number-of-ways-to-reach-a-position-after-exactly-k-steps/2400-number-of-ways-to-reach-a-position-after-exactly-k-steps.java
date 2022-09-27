class Solution {
    // Map<String,Integer> Memo;
    Integer memo[][]=new Integer[4001][1001];
    
    public int numberOfWays(int startPos, int endPos, int k) {
        // Memo=new Integer[startPos+endPos+1];
        // startPos+=1000;
        // endPos+=1000;
        // memo=new Integer[10000][1001];
        
        return findWays(startPos,endPos,k);
    }
    
    public int findWays(int currentPos,int dest,int k){
        
        if(k==0 && currentPos!=dest)
                return 0;
        
        if(k==0 && currentPos==dest)
                 return 1;
        
        if(memo[currentPos+2001][k]!=null)
               return memo[currentPos+2001][k];
        
        int leftWays=findWays(currentPos-1,dest,k-1);
        int rightWays=findWays(currentPos+1,dest,k-1);
        // Memo.put(currentPos+"#"+k,leftWays+rightWays);
        
        return memo[currentPos+2001][k]=(leftWays+rightWays)%1000000007;
    }
}
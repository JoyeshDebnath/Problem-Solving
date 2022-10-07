class Solution {
    public int maxHeight(int[][] cuboids) {
        
        for(int i=0;i<cuboids.length;i++)
            Arrays.sort(cuboids[i]);
        
        int res=0;
        int dp[]=new int[cuboids.length];
        //sort the enire cuboids in decresing order based on summation of dimention 
        Arrays.sort(cuboids,(a,b)->(b[0]+b[1]+b[2])-(a[0]+a[1]+a[2]));
        for(int i=0;i<cuboids.length;i++)
        {
            dp[i]=cuboids[i][2];
            res=Math.max(res,dp[i]);
        }
        
        for(int i=1;i<cuboids.length;i++){
              for(int j=0;j<i;j++){
                  if(cuboids[j][0]>=cuboids[i][0] &&
                    cuboids[j][1]>=cuboids[i][1]  &&
                    cuboids[j][2]>=cuboids[i][2]
                    ){
                      dp[i]=Math.max(dp[i],dp[j]+cuboids[i][2]);
                      res=Math.max(res,dp[i]);
                  }
              }
        }
        
        return res;
    }
}
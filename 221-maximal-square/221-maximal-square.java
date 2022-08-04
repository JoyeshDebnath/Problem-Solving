class Solution {
    public int maximalSquare(char[][] mat) {
        
        int dp[][]=new int[mat.length][mat[0].length];
           int maxArea=0;
        for(int i=0;i<mat[0].length;i++)
        {
            if(mat[0][i]=='0')
                dp[0][i]=0;
            else
                dp[0][i]=1;
            
            maxArea=Math.max(maxArea,dp[0][i]);
        }
        
        for(int j=0;j<mat.length;j++)
        {
            if(mat[j][0]=='0')
                  dp[j][0]=0;
            else 
                 dp[j][0]=1;
            
            maxArea=Math.max(maxArea,dp[j][0]);
        }
        
     
        for(int i=1;i<mat.length;i++)
        {
            for(int j=1;j<mat[0].length;j++)
            {
                 if(mat[i][j]=='0')
                            dp[i][j]=0;
                 else 
                     dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
           
                maxArea=Math.max(maxArea,dp[i][j]);
            }
        }
        
        return maxArea*maxArea;
    }
}
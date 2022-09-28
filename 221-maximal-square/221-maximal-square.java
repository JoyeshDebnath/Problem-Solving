class Solution {
    public int maximalSquare(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        
        int dp[][]=new int[m][n];
        
        int maxmArea=Integer.MIN_VALUE;
        
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                if(i==0)//if the 1st Row 
                {
               
                    if(matrix[i][j]=='0')
                            dp[i][j]=0;
                    else 
                          dp[i][j]=1;
                }//if the 1st Row ...... 
                
                else if(j==0)//if the 1st Column 
                {
                      
                    
                      if(matrix[i][j]=='0')
                             dp[i][j]=0;
                      else 
                             dp[i][j]=1;
                    
                }//if the 1st Column 
                
                else if (i!=0 && j!=0){
                    if(matrix[i][j]=='0')
                            dp[i][j]=0;
                    else{
                  
                    int topCell=dp[i-1][j];
         
                    int diagonalCell=dp[i-1][j-1];
                    
                    int leftCell=dp[i][j-1];
                     
                    
                    dp[i][j]=1+Math.min(diagonalCell,Math.min(leftCell,topCell));
                    }
                }
              
                maxmArea=Math.max(maxmArea,dp[i][j]);
            }
        }

        
        
        
     
     return maxmArea*maxmArea;
        
    }
}
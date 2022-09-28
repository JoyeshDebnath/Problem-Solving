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
                      // System.out.println("Cell Value="+i+ "   "+j);
                    if(matrix[i][j]=='0')
                            dp[i][j]=0;
                    else 
                          dp[i][j]=1;
                }//if the 1st Row ...... 
                
                else if(j==0)//if the 1st Column 
                {
                      // System.out.println("Cell Value="+i+ "   "+j);
                    
                      if(matrix[i][j]=='0')
                             dp[i][j]=0;
                      else 
                             dp[i][j]=1;
                    
                }//if the 1st Column 
                
                else if (i!=0 && j!=0){
                    if(matrix[i][j]=='0')
                            dp[i][j]=0;
                    else{
                    // System.out.println("Cell Value="+i+ "   "+j);
                    int topCell=dp[i-1][j];
                    // System.out.println("Top Cell="+topCell);
                    int diagonalCell=dp[i-1][j-1];
                     // System.out.println("Diagonal Cell="+diagonalCell);
                    int leftCell=dp[i][j-1];
                     // System.out.println("Left Cell="+leftCell);
                    
                    dp[i][j]=1+Math.min(diagonalCell,Math.min(leftCell,topCell));
                    }
                }
                // System.out.println("DP[I][J]="+dp[i][j]);
                maxmArea=Math.max(maxmArea,dp[i][j]);
            }
        }
//          System.out.println();
//         for(char row[]:matrix){
//             for(char r:row){
//                 System.out.print(r+"    ");
//             }
//             System.out.println();
//         }
        
        
        
        
        // System.out.println();
        // for(int row[]:dp){
        //     for(int r:row){
        //         System.out.print(r+"    ");
        //     }
        //     System.out.println();
        // }
     return maxmArea*maxmArea;
        
    }
}
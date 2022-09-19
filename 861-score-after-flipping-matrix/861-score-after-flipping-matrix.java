class Solution {
    public int FindScore(int[][] grid){
        int score=0;
        for(int row[]:grid){
              String bnStr="";
            for(int r:row)
                    bnStr+=r;
            
            int val=Integer.parseInt(bnStr,2);
            score+=val;
        }
        System.out.println("Score ="+score);
        return score;
        
}//calculate score of the grid 
   
    public int matrixScore(int[][] grid) {
        int maxScore=Integer.MIN_VALUE;
        //find the original score .. 
        int OriginalScore=FindScore(grid);
        maxScore=Math.max(maxScore,OriginalScore);
        //if the  1st col is 0 make it 1 
        for(int j=0;j<grid.length;j++){
            if(grid[j][0]==0)
                    flipRow(grid,j);
        }//flip the row if the 1st element of the row is zero 
        
           int ScoreAfterFirstColChange=FindScore(grid);
           maxScore=Math.max(maxScore,ScoreAfterFirstColChange);
       
      for(int j=1;j<grid[0].length;j++){
          int countOfOnes=findCount(grid,j);
          System.out.println("Ones ="+countOfOnes);
          if(countOfOnes<=Math.ceil(grid.length/2))
                flipCol(grid,j);
      }
        
         int finalScoreAfterChange=FindScore(grid);
          maxScore=Math.max(maxScore,finalScoreAfterChange);
        // System.out.println(OriginalScore+"   "+maxScore);
        return maxScore;
    }
    
    public int findCount(int grid[][],int col){
        int ones=0;
        for(int i=0;i<grid.length;i++){
            if(grid[i][col]==1)
                   ones++;
        }
        
        return ones;
    }
    
    public void flipCol(int[][] grid,int col){
        for(int j=0;j<grid.length;j++){
            if(grid[j][col]==0){
                grid[j][col]=1;
            }else
                grid[j][col]=0;
        }
    }//flip the colmn if the no of zeroes exceeds the no. of ones ....
    
    public void flipRow(int[][] grid,int row){
        for(int i=0;i<grid[0].length;i++){
            if(grid[row][i]==0){
                grid[row][i]=1;
            }else
                grid[row][i]=0;
        }
    }//flip the colmn if the no of zeroes exceeds the no. of ones ....
}
class Solution {
    int m;
    int n;
    public int[] findBall(int[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int Ans[]=new int[n];
        Arrays.fill(Ans,-1);
        if(n==1){
             return Ans;
        }
            for(int j=0;j<n;j++){
            if(j==0){
                if(grid[0][0]==-1){
                    Ans[j]=-1;
                    continue;
                }
            }
            else if(j==n-1){
                if(grid[0][n-1]==1){
                    Ans[n-1]=-1;
                    continue;
                }
        }
           
            // System.out.println("Passed val"+"   "+j); 
            int isSuccess=simulateFall(grid,0,j);
           
            if(isSuccess!=-1)
                Ans[j]=isSuccess;
            
        }//iterate over each balls 
        return Ans;
    }
    
    int simulateFall (int grid[][],int i,int j){
        //base case 
        if(j<0 || j>=n){
               // System.out.println(i+" ->  "+j);
              return -1;
        }
        
        if(i==m){
         // System.out.println(i+" ->  "+j);
            return j;
        }
        
//         System.out.println("Curr grid:  "+grid[i][j]+"   "+i+"   "+j);
//         System.out.println("Prev :  "+i+"   "+(j-1));
//           System.out.println("Prev :  "+i+"   "+(j+1));
        
        //rule 1 :
        if(grid[i][j]==1){
            if((j+1)<n && grid[i][j+1]==-1)
                return -1;
            else
                return simulateFall(grid,i+1,j+1);
        }
        
        //rule 2 
        if(grid[i][j]==-1){
            if((j-1)>=0 && grid[i][j-1]==1)
                return -1;
            else 
                return simulateFall(grid,i+1,j-1);
        }
        
        return -1;
    }//simulate fall 
}
class Pair{
    int row;
    int col;
    int k;
    int dist;
    Pair(int row,int col,int k,int dist){
        this.row=row;
        this.col=col;
        this.k=k;
        this.dist=dist;
    }
}//Pair 



class Solution {
    public int shortestPath(int[][] grid, int k) {
        
        int m=grid.length;
        int n =grid[0].length;
        
        int Steps=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(0,0,0,0));
        
        int rowDir[]={0,1,0,-1};
        int colDir[]={-1,0,1,0};
        
        boolean vis[][][]=new boolean [m][n][k+1];
        vis[0][0][0]=true;
        
        while(!q.isEmpty()){
         // int sz=q.size();
            
            // while(sz-->0){
                Pair rem=q.poll();
                int cr=rem.row;
                int cc=rem.col;
                int cDist=rem.dist;
                int cK=rem.k;
                
                if(cr==m-1 && cc==n-1)
                    return cDist;
                
                for(int i=0;i<4;i++){
                   int nextR=cr+rowDir[i];
                   int nextC=cc+colDir[i];
                
                    // if(nextR<0 || nextR>=m || nextC<0 ||nextC>=n)
                    //     continue;
                     if(nextR>=0 && nextC<n && nextC>=0 && nextR<m){
                 //if no obstacle 
                         int nk=cK+grid[nextR][nextC];
                    if(grid[nextR][nextC]==0 && vis[nextR][nextC][nk]==false)
                    {
                        q.add(new Pair(nextR,nextC,cK,cDist+1));
                        vis[nextR][nextC][nk]=true;
                    }
                    else if(grid[nextR][nextC]==1 && cK<k && vis[nextR][nextC][nk]==false){
                        q.add(new Pair(nextR,nextC,cK+1,cDist+1));
                        vis[nextR][nextC][nk]=true;
                    }
                     }
                }
            // }
          
      }//
        
        
         return -1;
    }
}
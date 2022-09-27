class Solution {
    Integer Memo[][];
    public int calculateMinimumHP(int[][] dungeon) {
        Memo=new Integer[dungeon.length+1][dungeon[0].length+1];
        return dungeonGame(dungeon,0,0);
        
    }
    
    
    public int dungeonGame(int[][] dungeon,int i,int j)
    {
        if(i>=dungeon.length || i<0 || j>=dungeon[0].length || j<0)
                return (Integer.MAX_VALUE-1);
        
        if(i==dungeon.length-1 && j==(dungeon[0].length-1))
                return (dungeon[i][j]>0)?1:Math.abs(dungeon[i][j])+1;
        
        if(Memo[i][j]!=null)
                return Memo[i][j];
        
        int down=dungeonGame(dungeon,i+1,j);
        int right=dungeonGame(dungeon,i,j+1);
        
        int currentHealth=dungeon[i][j];
        int nextHealth=Math.min(down,right);
            
        if(currentHealth>=nextHealth)
                  return 1;
        
        return Memo[i][j]=nextHealth-currentHealth;
            
    }//Dungeon Game 
}
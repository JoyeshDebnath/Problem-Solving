class Solution {
    Integer Memo[][];
    public int coinChange(int[] coins, int amount) {
        Memo=new Integer[coins.length+1][amount+1];
     int ans=findChange(coins,amount,coins.length-1);
      return (ans>=2147483646)?-1:ans;
    }
    
    public int findChange(int[] coins,int amt,int index){
        if(index<0)
               return Integer.MAX_VALUE-1;
        
        if(amt==0)
               return 0;
        
        if(amt<0)
               return Integer.MAX_VALUE-1;
        
        if(Memo[index][amt]!=null)
                   return Memo[index][amt];
        
        
        int pick=Integer.MAX_VALUE-1;
        
        if(coins[index]<=amt)
             pick=1+findChange(coins,amt-coins[index],index);
        
        int dontPick=findChange(coins,amt,index-1);
        return  Memo[index][amt]=Math.min(pick,dontPick);
        
        
    }
}
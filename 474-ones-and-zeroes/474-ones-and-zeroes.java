class Solution {
    Integer Memo[][][];
    
    public int findMaxForm(String[] strs, int m, int n) {
        Memo=new Integer[m+1][n+1][strs.length+2];
        
     return findMaxFormRec(strs,0,m,n);
        
        
    }
   public int[] countOnesZeros(String str){
       int Count[]=new int[2];
       //Count[0]---->> zero count 
       //Count[1]---->> Ones count 
       for(char ch:str.toCharArray()){
           if(ch=='1')
                 Count[1]++;
           else 
                 Count[0]++;
       }
       return Count;
   }//count of ones and zeros 
    
   public int  findMaxFormRec(String[] strs,int index,int m,int n){
    if(index>=strs.length || (m==0 && n==0))
         return 0;
       
    if(Memo[m][n][index]!=null)
          return Memo[m][n][index];
    
       //Include the Current substring 
    int include=0;
    int Count[]=countOnesZeros(strs[index]);
    if(m>=Count[0] && n>=Count[1])
          include=1+findMaxFormRec(strs,index+1,m-Count[0],n-Count[1]);
    
    int exclude=findMaxFormRec(strs,index+1,m,n);
    
    return Memo[m][n][index]=Math.max(include,exclude);
    
}
}
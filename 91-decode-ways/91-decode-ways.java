class Solution {
    
    Integer memo[];
    public int numDecodings(String s) {
        if(s.length()==1 && s.charAt(0)=='0')
             return 0;
        
        if(s.length()==1)
             return 1;
              
        memo=new Integer[s.length()+5];
        
        // return decodeWays(s.toCharArray(),0);//memorisation/recursive 
        return decodeWaysTab(s.toCharArray());//tabulation
    }
    
    boolean isValid(char digits[],int index)
    {
         String num=digits[index]+""+digits[index+1];
         if(Integer.parseInt(num)>26)
                return false;
         
         return true;
    }//check if the formed number if two digits taken is valid 
    
    public int decodeWays(char digits[],int idx){
       
        if(idx>=digits.length)
              return 1 ;//formed 1 decoding successfully
        
         if(digits[idx]=='0')
              return 0;//not possible 
        
        if(memo[idx]!=null)
            return memo[idx];
        
        int pickOneDigits=decodeWays(digits,idx+1);
        int pickTwoDigits=0;
        if(idx<=digits.length-2  && isValid(digits,idx))
              pickTwoDigits=decodeWays(digits,idx+2);
        
        return memo[idx]=pickOneDigits+pickTwoDigits;
    }//memo/rec 
    
    
    public int decodeWaysTab(char digits[]){
        
        int dp[]=new int[digits.length+2];
        dp[digits.length]=1;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]=='0'){
                dp[i]=0;
                continue;
            }
            if(i==digits.length-1){
                 dp[i]=1;
                 continue;
            }
            
            int pickOneDigit=dp[i+1];
            int pickTwoDigits=0;     
            if(i<=digits.length-2 && isValid(digits,i))
                   pickTwoDigits=dp[i+2];
            
            dp[i]=pickOneDigit+pickTwoDigits;
        }
        
        return dp[0];
    }//tabulation 
    
}
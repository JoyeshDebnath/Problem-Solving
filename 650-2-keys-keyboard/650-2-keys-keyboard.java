class Solution {
    Integer memo[][]=new Integer[1001][1001];
    
    public int minSteps(int n) {
        if(n==1)
               return 0;//no steps required 
        
        
        //initially we will cosider steps =1 as copied  ---->>COPY "A"
        // copied =1 as copied--->>copied = "A"
        // val =1-->> initial value---->> val="A"
        return TwoKeysKeyboard(1,1,1,n);
    }
    
    public int TwoKeysKeyboard(int steps,int val,int copied,int n){
        if(steps>n || val>n)
                return Integer.MAX_VALUE;
        
        if(val==n)
                return steps;
        
        
        if(memo[steps][val]!=null)
                return memo[steps][val];
        
        //there are two options 
        //1> we paste ---->>> here the steps =steps+1 for pasting &&&&  val=val+copied  &&&& copied=copied  
        //2>> we copy the enmtire thing and paste 
        //here steps=steps+2 for copying and pasting .... && val=val*2  since we are copying and pasting ...... copied =val
        
        return memo[steps][val]=Math.min(TwoKeysKeyboard(steps+1,val+copied,copied,n), TwoKeysKeyboard(steps+2,val*2,val,n));
    }
}
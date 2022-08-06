class Solution {
    public int minAddToMakeValid(String s) {
      
        int open=0;
        int close=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            char x=ch[i];
            if(x=='(')
            {
                open++;
            }
            else if(x==')')
            {
                if(open!=0)
                    open--;
                else
                    close++;
            }
        }
        return open+close;
        
        
        
    }
}
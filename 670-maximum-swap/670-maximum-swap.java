class Solution {
    public int maximumSwap(int num) {
       
        String numStr=String.valueOf(num);
        char digits[]=numStr.toCharArray();
        int n=digits.length;
        int maxPos=n-1;
        int maxIdx[]=new int[n];
        maxIdx[n-1]=maxPos;
        
        
        
        for(int i=n-2;i>=0;i--)
        {
            if(digits[i]>digits[maxIdx[i+1]])
            {
                   maxPos=i;
                    
            }
            maxIdx[i]=maxPos;
        }
        
        
        for(int i=0;i<n;i++)
        {
              if(digits[i]!=digits[maxIdx[i]])
              {
                  char temp=digits[maxIdx[i]];
                  digits[maxIdx[i]]=digits[i];
                  digits[i]=temp;
                  break;
              }
        }
        
        return Integer.parseInt(String.valueOf(digits));
        
        
    }
}
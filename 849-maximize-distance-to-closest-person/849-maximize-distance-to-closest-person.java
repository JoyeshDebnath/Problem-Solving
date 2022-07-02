class Solution {
    public int maxDistToClosest(int[] seats) {
        
        int n=seats.length;
        
        int left[]=new int[n];
        int right[]=new int[n];
    
        for(int i=0;i<n;i++)
        {
            if(seats[i]==0 && (i==0 || left[i-1]==Integer.MAX_VALUE))
            {
                left[i]=Integer.MAX_VALUE;
            }
            else if(i>0 && seats[i]==0 && left[i-1]!=Integer.MAX_VALUE)
                left[i]=left[i-1];
            
            else //if seats[i] is 1
               left[i]=i;       
        }//precompute left closest 
        
        
        for(int j=n-1;j>=0;j--)
        {
            if(seats[j]==0 && (j==n-1 || right[j+1]==Integer.MAX_VALUE))
            {
                right[j]=Integer.MAX_VALUE;
            }
            else if(j<n-1 && seats[j]==0 && right[j+1]!=Integer.MAX_VALUE)
                right[j]=right[j+1];
            
            else //if seats[i] is 1
               right[j]=j;   
        }//precompute right closest 
    
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(seats[i]==1)
                  continue;
                
            else //sests[i]==0
            {
                   int leftDistance=(left[i]==Integer.MAX_VALUE)?Integer.MAX_VALUE:Math.abs(i-left[i]);
                   int rightDistance=(right[i]==Integer.MAX_VALUE)?Integer.MAX_VALUE:Math.abs(i-right[i]);
                
                   ans=Math.max(ans,Math.min(leftDistance,rightDistance));
            }
        }
        
        return ans;
    
    }
}
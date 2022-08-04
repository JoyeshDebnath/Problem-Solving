class Solution {
    
    public int[] findNextSmaller(int A[])
    { 
        int n=A.length;
        int NSE[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        NSE[n-1]=n;
        stack.push(n-1);
        
        for(int i=n-2;i>=0;i--)
        {
            int curr=A[i];
            while(!stack.isEmpty() && A[stack.peek()]>=curr)
                stack.pop();
            
            if(stack.isEmpty())
                 NSE[i]=n;
            else 
                NSE[i]=stack.peek();
            
            stack.push(i);
        }
        
        return NSE;
    }//next smaller elements 
    
    
        public int[] findPrevSmaller(int A[])
    { 
        int n=A.length;
        int PSE[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        PSE[0]=-1;
        stack.push(0);
        
        for(int i=1;i<=n-1;i++)
        {
            int curr=A[i];
            while(!stack.isEmpty() && A[stack.peek()]>=curr)
                stack.pop();
            
            if(stack.isEmpty())
                 PSE[i]=-1;
            else 
                PSE[i]=stack.peek();
            
            stack.push(i);
        }
         
             return PSE;
    }//next smaller elements 
    
    public int largestRectangleArea(int[] heights) {
        
        int NSE[]=findNextSmaller(heights);
        int PSE[]=findPrevSmaller(heights);
        int max=-1;
        for(int i=0;i<heights.length;i++)
        {
            int ns=NSE[i];
            int ps=PSE[i];
            
            int currHt=((ns-ps)-1)*heights[i];
            max=Math.max(max,currHt);
        }
        
        return max;
        
        
        
    }
}
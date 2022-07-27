class Solution {
    public int[] dailyTemperatures(int[] A) {
        Stack<Integer> stack=new Stack<>();
        int NGE[]=new int[A.length];
        for(int i=A.length-1;i>=0;i--)
        {
            int curr=A[i];
            
            while(!stack.isEmpty() && (A[stack.peek()]<=curr))
                     stack.pop();
            
            if(!stack.isEmpty())
            {
                NGE[i]=stack.peek()-i;
            }
            stack.push(i);
        }
        
        return NGE;
    }
}
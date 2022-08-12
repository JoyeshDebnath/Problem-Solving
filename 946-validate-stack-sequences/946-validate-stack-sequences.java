class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        
        int i=0;
        int j=0;
        Stack<Integer> stack=new Stack<>();
        
        while(j<popped.length)
        {
       
            while(i<pushed.length && (stack.isEmpty()|| stack.peek()!=popped[j]))
            {
                stack.push(pushed[i]);
                i++;
            }
            
            if(stack.peek()==popped[j])
            {
                j++;
                stack.pop();
            }
            if(stack.isEmpty() && i==pushed.length && j==popped.length)
            {
                return true;
            }
            else if(i==pushed.length && popped[j]!=stack.peek())
                 return false;
        }
        return false;
    }
}
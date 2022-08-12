class Solution {
    public int minOperations(String[] logs) {
        
        Stack<String> stack=new Stack<>();
        
        for(String log:logs)
        {
            if(log.contains("../")==true)
            {
                if(!stack.isEmpty())
                            stack.pop();
            }
            else if(log.contains("./")==true)
                   continue;
            else 
                stack.push(log);
        }
        
        return stack.size();
    }
}
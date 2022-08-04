class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        
        
        Stack<Integer> stack=new Stack<>();
        
        for(int asteroid : asteroids){
            
             if(asteroid>0)
                     stack.push(asteroid);
            
             else {//if negetive 
                 while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(asteroid))
                     stack.pop();
                 
                 if(stack.isEmpty() || stack.peek()<0)
                        stack.push(asteroid);
                 
                 if(stack.peek()+asteroid==0)
                       stack.pop();
                 
                 
             }
            
            
        }//loop
        
        int Ans[]=new int[stack.size()];
        int index=stack.size()-1;
        while(!stack.isEmpty())
        {
            Ans[index--]=stack.pop();
        }
        
        return Ans;
        
    }
}
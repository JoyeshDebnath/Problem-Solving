class Solution {
    public String smallestNumber(String pattern) {
        Stack<Integer> stack=new Stack<>();
        StringBuilder ans=new StringBuilder();
        
        char[] Pat=pattern.toCharArray();
        if(Pat[0]=='I'){
           ans.append('1');    
        }
        else
              stack.push(1);
        
        for(int i=1;i<=Pat.length;i++){
             if(Pat[i-1]=='I'){
                 while(!stack.isEmpty() )
                         ans.append(stack.pop());
             } 
            stack.push(i+1);
        
        }//
            while(!stack.isEmpty() )
                         ans.append(stack.pop());
            
            return ans.toString();
        
    }
}
class Solution {
    public String robotWithString(String s) {
        char str[]=s.toCharArray();
        int n=str.length;
        char suffix[]=new char[n];
        
        suffix[n-1]=str[n-1];
        
        for(int i=n-2;i>=0;i--)
               suffix[i]=(char)Math.min(suffix[i+1],str[i]);
        
        Stack<Character> stack=new Stack<>();
        int i=0;
        
        StringBuilder paper=new StringBuilder();
        
        while(i<n){
           if(stack.size()==0)
           {
               stack.push(str[i]);
               i++;
               continue;
           }
        
          if(stack.peek()<=suffix[i]){
              paper.append(stack.pop());
          }
        else{
              stack.push(str[i]);
              i++;
            }
    }//
        
    while(!stack.isEmpty())
         paper.append(stack.pop());
        
        
        return paper.toString();
        
        
    }
}
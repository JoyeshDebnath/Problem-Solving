class Solution {
    
    public String formWord(String str)
    {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char x=str.charAt(i);
            if(x!='#')
                  stack.push(x);
            else{
                if(!stack.isEmpty())
                             stack.pop();
            }
    }
        
        StringBuilder sb=new StringBuilder();
        for(char ch:stack)
            sb.append(ch);
        
        return sb.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        
        String str1=formWord(s);
        String str2=formWord(t);
        
        return str1.equals(str2);
    }
}
class Solution {
    public String removeDuplicateLetters(String str) {
        // List<Character> visited=new ArrayList<>();
        boolean[] visited=new boolean[26];
        
        Stack<Character> stack=new Stack<>();
        int freq[]=new int[26];
        char[] s=str.toCharArray();
        for(int c:s){
            freq[c-'a']++;
        }
        
        int i=0;
        int n=s.length;
        
        while(i<n){
            
         if(visited[s[i]-'a']==true){
             freq[s[i]-'a']--;
             i++;
             continue;
         }    
            
         while(!stack.isEmpty() && stack.peek()>s[i] && freq[stack.peek()-'a']>0 )  {
             visited[stack.peek()-'a']=false;
             stack.pop();
         } 
            stack.push(s[i]);
            freq[s[i]-'a']--;
            visited[s[i]-'a']=true;
            i++;
        }
        
        
      String ans="";
        while(!stack.isEmpty())
              ans=stack.pop()+ans;
        
        return ans;
    }
}
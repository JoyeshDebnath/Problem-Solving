class Solution {
    HashSet<String> visited=new HashSet<>();
    
    public List<String> removeInvalidParentheses(String strs) {
        int minmRemovalAllowed=findMinmRemovalAllowed(strs.toCharArray());
		// System.out.println("The number of invalid Parenthesis="+minmRemovalAllowed);
		List<String> Ans=new ArrayList<>();
        
		Solve(strs,Math.abs(minmRemovalAllowed),Ans);
        
        if(Ans.size()==0)
               Ans.add("");
        
        return Ans;
    }
    
    public  void Solve(String strs,int mra,List<String> Ans){
		if(mra==0){
			if(findMinmRemovalAllowed(strs.toCharArray())==0){
				if(!Ans.contains(strs))
					       Ans.add(strs);
			}
			return;
		}//if no removal option left 

		for(int i=0;i<strs.length();i++){
			if(strs.charAt(i)=='(' || strs.charAt(i)==')'){
				String left=strs.substring(0,i);
				String right=strs.substring(i+1);
            if(!visited.contains(left+right)){
			    visited.add(left+right);
                Solve(left+right,mra-1,Ans);
            }
			}
		}//remove each character and cehck 
	}
    
    
    public  int findMinmRemovalAllowed(char[] S){
		int mra=0;
		Stack<Character> stack=new Stack<>();
		for(char c:S){
			if(c=='(')
				  stack.push('(');

		else if(c==')' && (stack.size()==0 || stack.peek()==')'))
				  stack.push(')');

			else if(c==')' && stack.size()>0 && stack.peek()=='(')
				     stack.pop();
		}
		return stack.size();
	} //find minm number of parenthesis to be removed 
}
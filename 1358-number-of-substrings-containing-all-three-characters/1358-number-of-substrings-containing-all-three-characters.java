class Solution {
    public int numberOfSubstrings(String s) {
        char[] S=s.toCharArray();
        int N=S.length;
        int Ans=0;
		int start=0;
		int end =0;
		HashMap<Character,Integer> map=new       HashMap<Character,Integer>();
        while(end<N){
           char ch=S[end];
           map.put(ch,map.getOrDefault(ch,0)+1);

           if(map.size()>=3){

           	while(map.size()>=3){
           		if(map.get(S[start])==1)
           			  map.remove(S[start]);
           		else
           			map.put(S[start],map.get(S[start])-1);
           		start++;
           	}
           }
           Ans+=(start);
           end++;
        }//
return Ans;
    }
}
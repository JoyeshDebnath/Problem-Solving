class Solution {
    public int characterReplacement(String s, int k) {
      	
        char A[]=s.toCharArray();
        int start=0;
		int end=0;
		int max=0;
        int maxFreq=0;
        
       int N=A.length;
       int count[]=new int[26];//keep a track of the freq of the characters
       while(end<N){
        
        char ch=A[end];
        count[ch-'A']++;
        maxFreq=Math.max(maxFreq,count[ch-'A']);
        int windowSz=end-start+1;
        int characterToBeReplaced=(windowSz-maxFreq);
        if(characterToBeReplaced>k){
        	//invalid window
        	count[A[start]-'A']--;
        	start++;
        }
        else{
        	//valid window .. 
        	max=Math.max(max,windowSz);
        }
        end++;
        
       }
        return max;
    }
}